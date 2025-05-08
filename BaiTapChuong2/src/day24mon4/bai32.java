package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.BorderLayout;

public class bai32 {

	private JFrame frame;
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai32 window = new bai32();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai32() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("TextArea Example");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(e -> textArea.setText(""));
		frame.getContentPane().add(btnClear, BorderLayout.SOUTH);
	}
}
