package day24mon4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai23 frame = new bai23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bai23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton_10_3_4 = new JButton("C");
		btnNewButton_10_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10_3 = new JButton("7");
		GridBagConstraints gbc_btnNewButton_10_3 = new GridBagConstraints();
		gbc_btnNewButton_10_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10_3.gridx = 0;
		gbc_btnNewButton_10_3.gridy = 5;
		contentPane.add(btnNewButton_10_3, gbc_btnNewButton_10_3);
		
		JButton btnNewButton_7 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 1;
		gbc_btnNewButton_7.gridy = 5;
		contentPane.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_10_3_1 = new JButton("9");
		GridBagConstraints gbc_btnNewButton_10_3_1 = new GridBagConstraints();
		gbc_btnNewButton_10_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10_3_1.gridx = 2;
		gbc_btnNewButton_10_3_1.gridy = 5;
		contentPane.add(btnNewButton_10_3_1, gbc_btnNewButton_10_3_1);
		
		JButton btnNewButton_8 = new JButton("+");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 3;
		gbc_btnNewButton_8.gridy = 5;
		contentPane.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("4");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 6;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_10_2 = new JButton("5");
		GridBagConstraints gbc_btnNewButton_10_2 = new GridBagConstraints();
		gbc_btnNewButton_10_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10_2.gridx = 1;
		gbc_btnNewButton_10_2.gridy = 6;
		contentPane.add(btnNewButton_10_2, gbc_btnNewButton_10_2);
		
		JButton btnNewButton_6 = new JButton("6");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 2;
		gbc_btnNewButton_6.gridy = 6;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_10_3_2 = new JButton("-");
		GridBagConstraints gbc_btnNewButton_10_3_2 = new GridBagConstraints();
		gbc_btnNewButton_10_3_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10_3_2.gridx = 3;
		gbc_btnNewButton_10_3_2.gridy = 6;
		contentPane.add(btnNewButton_10_3_2, gbc_btnNewButton_10_3_2);
		
		JButton btnNewButton_10 = new JButton("1");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 0;
		gbc_btnNewButton_10.gridy = 7;
		contentPane.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_4 = new JButton("2");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 7;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_10_1 = new JButton("3");
		GridBagConstraints gbc_btnNewButton_10_1 = new GridBagConstraints();
		gbc_btnNewButton_10_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10_1.gridx = 2;
		gbc_btnNewButton_10_1.gridy = 7;
		contentPane.add(btnNewButton_10_1, gbc_btnNewButton_10_1);
		
		JButton btnNewButton_9 = new JButton("*");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 3;
		gbc_btnNewButton_9.gridy = 7;
		contentPane.add(btnNewButton_9, gbc_btnNewButton_9);
		GridBagConstraints gbc_btnNewButton_10_3_4 = new GridBagConstraints();
		gbc_btnNewButton_10_3_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_10_3_4.gridx = 0;
		gbc_btnNewButton_10_3_4.gridy = 8;
		contentPane.add(btnNewButton_10_3_4, gbc_btnNewButton_10_3_4);
		
		JButton btnNewButton_3 = new JButton("0");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 8;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_10_3_3 = new JButton("/");
		GridBagConstraints gbc_btnNewButton_10_3_3 = new GridBagConstraints();
		gbc_btnNewButton_10_3_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_10_3_3.gridx = 2;
		gbc_btnNewButton_10_3_3.gridy = 8;
		contentPane.add(btnNewButton_10_3_3, gbc_btnNewButton_10_3_3);
		
		JButton btnNewButton_2 = new JButton("=");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 8;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
	}

}
