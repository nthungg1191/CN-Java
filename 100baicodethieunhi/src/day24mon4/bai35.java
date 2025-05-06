package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

public class bai35 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai35 window = new bai35();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai35() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Multiple Layouts");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		JPanel centerPanel = new JPanel(new GridLayout(3, 3));
		for (int i = 1; i <= 9; i++) {
			centerPanel.add(new JButton("Button " + i));
		}
		frame.getContentPane().add(centerPanel, BorderLayout.CENTER);

		JButton btnReset = new JButton("Reset");
		frame.getContentPane().add(btnReset, BorderLayout.SOUTH);
	}
}
