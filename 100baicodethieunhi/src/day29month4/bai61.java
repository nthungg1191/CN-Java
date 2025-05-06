package day29month4;

import java.awt.Button;
import java.awt.EventQueue;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai61 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai61 frame = new bai61();
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
	public bai61() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(108, 26, 270, 212);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("load img");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadimg();
			}
		});
		btnNewButton.setBounds(200, 266, 85, 21);
		contentPane.add(btnNewButton);
		
	}
	private void loadimg() {
		btnNewButton.setEnabled(false);
        SwingWorker<ImageIcon, Void> worker = new SwingWorker<>() {
            @Override
            protected ImageIcon doInBackground() throws Exception {
                String imageUrl = "https://dummyimage.com/400x300/000/fff";
                return new ImageIcon(new URL(imageUrl));
            }
            @Override
            protected void done() {
                try {
                    ImageIcon icon = get();
                    lblNewLabel.setIcon(icon);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(bai61.this, "Error: " + e.getMessage());
                } finally {
                    btnNewButton.setEnabled(true);
                }
            }
        };

        worker.execute();
    }
		
	}

