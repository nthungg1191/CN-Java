package day29month4;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class bai49 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai49 frame = new bai49();
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
	public bai49() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sample");
		lblNewLabel.setBounds(119, 101, 47, 13);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Red");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.red);
			}
		});
		rdbtnNewRadioButton.setBounds(199, 14, 62, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.BLUE);
			}
		});
		rdbtnBlue.setBounds(112, 14, 62, 21);
		contentPane.add(rdbtnBlue);
		

		
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.GREEN);
			}
		});

		rdbtnGreen.setBounds(25, 14, 62, 21);
		contentPane.add(rdbtnGreen);
		

	}
}
