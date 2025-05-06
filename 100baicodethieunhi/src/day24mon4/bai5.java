package day24mon4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class bai5 {

	private JFrame frame;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai5 window = new bai5();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bai5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Digital Clock");
		frame.setBounds(100, 100, 300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String currentTime = now.format(formatter);

		lblTime = new JLabel(currentTime, SwingConstants.CENTER);
		lblTime.setFont(new Font("Arial", Font.BOLD, 28));
		frame.getContentPane().add(lblTime, BorderLayout.CENTER);
	}
}
