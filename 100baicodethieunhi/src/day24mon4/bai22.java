package day24mon4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class bai22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai22 frame = new bai22();
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
	public bai22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbContent = new JLabel("");
		lbContent.setName("lbContent");
		lbContent.setBounds(101, 105, 45, 13);
		contentPane.add(lbContent);
		
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = comboBox.getSelectedIndex();
				
				switch (selected) {
				case 0: 
					lbContent.setText("Chuối");
					break;
				case 1: 
					lbContent.setText("Ổi");
					break;
				case 2: 
					lbContent.setText("Cam");
					break;
				case 3: 
					lbContent.setText("Xoài");
					break;
				case 4: 
					lbContent.setText("Dưa hấu");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + selected);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chuối ", "Ổi", "Cam ", "Xoài", "Dưa hấu"}));
		comboBox.setBounds(101, 42, 63, 21);
		contentPane.add(comboBox);
		

		
//		String[] fruits = {"Táo", "Chuối", "Xoài", "Cam", "Dưa hấu"};
//		JComboBox<String> comboBox = new JComboBox<>(fruits);
//		comboBox.setBounds(83, 10, 99, 21);
//		getContentPane().add(comboBox);
//		
//		JLabel lblNewLabel = new JLabel("Your choice: ");
//		lblNewLabel.setBounds(83, 90, 99, 13);
//		getContentPane().add(lblNewLabel);
//		
//		comboBox.addActionListener(e -> {
//			String selected = (String) comboBox.getSelectedItem();
//			lblNewLabel.setText("Your choice:"+selected);
		
		
//	});

	}
}
