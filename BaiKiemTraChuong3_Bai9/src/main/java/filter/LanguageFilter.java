package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class LanguageFilter
 */
@WebFilter("/LanguageFilter")
public class LanguageFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LanguageFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String lang = request.getParameter("lang");

        if (lang != null && !(lang.equals("en") || lang.equals("vi"))) {
            // Chuyển hướng nếu lang không hợp lệ
            ((HttpServletResponse) response).sendRedirect("languageForm.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
