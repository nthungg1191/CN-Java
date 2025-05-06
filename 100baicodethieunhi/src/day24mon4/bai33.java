package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

public class bai33 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai33 window = new bai33();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai33() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("GridBagLayout Form");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		JLabel lblName = new JLabel("Name:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		frame.getContentPane().add(lblName, gbc);

		JTextField txtName = new JTextField(15);
		gbc.gridx = 1;
		frame.getContentPane().add(txtName, gbc);

		JLabel lblAge = new JLabel("Age:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		frame.getContentPane().add(lblAge, gbc);

		JSpinner spinnerAge = new JSpinner(new SpinnerNumberModel(18, 0, 120, 1));
		gbc.gridx = 1;
		frame.getContentPane().add(spinnerAge, gbc);

		JButton btnSubmit = new JButton("Submit");
		gbc.gridx = 1;
		gbc.gridy = 2;
		frame.getContentPane().add(btnSubmit, gbc);
	}
}
