package day24mon4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class bai9 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai9 window = new bai9();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai9() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Main Window");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnOpen = new JButton("Open Dialog");
		btnOpen.setBounds(180, 150, 140, 40);
		frame.getContentPane().add(btnOpen);

		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog(frame, "Dialog", true);
				dialog.setSize(200, 150);
				dialog.setLayout(new BorderLayout());

				JLabel lbl = new JLabel("This is a dialog", SwingConstants.CENTER);
				dialog.add(lbl, BorderLayout.CENTER);

				dialog.setLocationRelativeTo(frame);
				dialog.setVisible(true);
			}
		});
	}
}
