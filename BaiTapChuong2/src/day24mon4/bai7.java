package day24mon4;

import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class bai7 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai7 window = new bai7();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai7() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Resizable Frame");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		frame.setMinimumSize(new Dimension(200, 150));

		frame.setMaximumSize(new Dimension(800, 600));

		JLabel label = new JLabel("Resizable Window", SwingConstants.CENTER);
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}
}
