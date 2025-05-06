package day24mon4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;

public class bai16 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai16 window = new bai16();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai16() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("BorderLayout Example");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JLabel lblNorth = new JLabel("North", SwingConstants.CENTER);
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.RED);
		frame.getContentPane().add(lblNorth, BorderLayout.NORTH);

		JLabel lblSouth = new JLabel("South", SwingConstants.CENTER);
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.GREEN);
		frame.getContentPane().add(lblSouth, BorderLayout.SOUTH);

		JLabel lblEast = new JLabel("East", SwingConstants.CENTER);
		lblEast.setOpaque(true);
		lblEast.setBackground(Color.YELLOW);
		frame.getContentPane().add(lblEast, BorderLayout.EAST);

		JLabel lblWest = new JLabel("West", SwingConstants.CENTER);
		lblWest.setOpaque(true);
		lblWest.setBackground(Color.BLUE);
		frame.getContentPane().add(lblWest, BorderLayout.WEST);

		JLabel lblCenter = new JLabel("Center", SwingConstants.CENTER);
		lblCenter.setOpaque(true);
		lblCenter.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblCenter, BorderLayout.CENTER);
	}
}
