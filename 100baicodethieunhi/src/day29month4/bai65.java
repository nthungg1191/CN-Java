package day29month4;

import java.awt.EventQueue;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class bai65 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Timer timer;
	private JLabel lblNewLabel;
	private JButton btnStart;
	private JButton btnStop;
	private JButton btnReset;
	private int elapsedSeconds = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai65 frame = new bai65();
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
	public bai65() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Time 00:00:00");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(85, 19, 116, 13);
		contentPane.add(lblNewLabel);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		btnStart.setBounds(102, 119, 82, 21);
		contentPane.add(btnStart);
		
		btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		btnStop.setBounds(102, 88, 82, 21);
		contentPane.add(btnStop);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				elapsedSeconds = 0;
				updateTime();
			}
		});
		btnReset.setBounds(102, 58, 82, 21);
		contentPane.add(btnReset);
		
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				elapsedSeconds++;
				updateTime();
				
			}
		});
	}
	private void updateTime() {
	    int hours = elapsedSeconds / 3600;
	    int minutes = (elapsedSeconds % 3600) / 60;
	    int seconds = elapsedSeconds % 60;
	    lblNewLabel.setText(String.format("Time: %02d:%02d:%02d", hours, minutes, seconds));
	}


}
