package day24mon4;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class bai8 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai8 window = new bai8();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai8() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Colored Background");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().setBackground(Color.GREEN);

		JLabel label = new JLabel("Colored Background", SwingConstants.CENTER);
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}
}
