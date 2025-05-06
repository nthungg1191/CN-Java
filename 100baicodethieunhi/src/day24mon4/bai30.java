package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;

public class bai30 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai30 window = new bai30();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai30() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("JToolBar Example");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JToolBar toolBar = new JToolBar();
		JButton btnNew = new JButton("New");
		JButton btnSave = new JButton("Save");
		JButton btnOpen = new JButton("Open");

		btnNew.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New clicked"));
		btnSave.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Save clicked"));
		btnOpen.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open clicked"));

		toolBar.add(btnNew);
		toolBar.add(btnSave);
		toolBar.add(btnOpen);

		frame.getContentPane().add(toolBar, "North");
	}
}
