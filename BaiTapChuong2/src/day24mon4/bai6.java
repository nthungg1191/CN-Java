package day24mon4;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class bai6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai6 window = new bai6();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai6() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Custom Icon");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		ImageIcon icon = new ImageIcon("d5372293e271502f0960.jpg");
		Image img = icon.getImage();
		frame.setIconImage(img);

		JLabel label = new JLabel("Custom Icon Window", SwingConstants.CENTER);
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}
}
