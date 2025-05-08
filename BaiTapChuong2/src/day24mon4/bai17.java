package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.FlowLayout;

public class bai17 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai17 window = new bai17();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai17() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Login Form");
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

		frame.getContentPane().add(new JLabel("Username:"));
		frame.getContentPane().add(new JTextField(15));

		frame.getContentPane().add(new JLabel("Password:"));
		frame.getContentPane().add(new JPasswordField(15));

		frame.getContentPane().add(new JButton("Login"));
	}
}
