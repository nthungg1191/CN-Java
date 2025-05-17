package com.example.btchuong4bai7.security;

import com.example.btchuong4bai7.entity.User;
import com.example.btchuong4bai7.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Map;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, UserRepository userRepo) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").authenticated()
                        .anyRequest().permitAll())
                .oauth2Login(oauth -> oauth
                        .userInfoEndpoint(userInfo -> userInfo.userService(oauth2UserService(userRepo)))
                        .defaultSuccessUrl("/", true))
                .logout(logout -> logout.logoutSuccessUrl("/"));

        return http.build();
    }

    public OAuth2UserService<OAuth2UserRequest, OAuth2User> oauth2UserService(UserRepository userRepo) {
        return request -> {
            OAuth2User oauthUser = new DefaultOAuth2UserService().loadUser(request);
            Map<String, Object> attributes = oauthUser.getAttributes();

            String email = (String) attributes.get("email");
            String name = (String) attributes.get("name");

            userRepo.findByEmail(email)
                    .orElseGet(() -> userRepo.save(User.builder().email(email).name(name).build()));

            return oauthUser;
        };
    }
}

