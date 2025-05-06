package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

public class bai18 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai18 window = new bai18();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai18() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Chess Board");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(8, 8));

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				JPanel cell = new JPanel();
				if ((row + col) % 2 == 0) {
					cell.setBackground(Color.WHITE);
				} else {
					cell.setBackground(Color.BLACK);
				}
				frame.getContentPane().add(cell);
			}
		}
	}
}
