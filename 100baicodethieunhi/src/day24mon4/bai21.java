package day24mon4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class bai21 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai21 frame = new bai21();
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
	public bai21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 266, 343);
		contentPane.add(scrollPane);
		
		String[] cities = {"Thanh Hóa","Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Cần Thơ", "Huế", "Nha Trang", "Vũng Tàu", "Đà Lạt", "Biên Hòa", "Buôn Ma Thuột"};
		JList<String> list = new JList<>(cities);
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Số Lượng Thành Phố: "+list.getModel().getSize());
		scrollPane.setColumnHeaderView(lblNewLabel);
	}
}
