package day24mon4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class cau20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cau20 frame = new cau20();
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
	public cau20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 466, 343);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("day la man hinh chinh");
		lblNewLabel.setLocation(250, 24);
		tabbedPane.addTab("Home", null, lblNewLabel, null);
		
		JLabel lblNewLabel_1 = new JLabel("Your profile");
		tabbedPane.addTab("Profile", null, lblNewLabel_1, null);
		
		JLabel lblNewLabel_2 = new JLabel("Your setting is here!");
		tabbedPane.addTab("Setting", null, lblNewLabel_2, null);
		
		

	}
}
