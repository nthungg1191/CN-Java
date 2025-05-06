package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

public class bai34 {

	private JFrame frame;
	private JLabel lblValue;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai34 window = new bai34();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai34() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("JSpinner Example");
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());

		JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		frame.getContentPane().add(spinner);

		lblValue = new JLabel("Current Value: 1");
		frame.getContentPane().add(lblValue);

		spinner.addChangeListener(e -> {
			int value = (int) spinner.getValue();
			lblValue.setText("Current Value: " + value);
		});
	}
}
