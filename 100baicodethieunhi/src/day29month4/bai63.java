package day29month4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai63 extends JFrame {
    private JLabel lblCount;
    private JButton btnStart, btnPause, btnResume;
    private int count = 0;
    private volatile boolean paused = false;
    private volatile boolean running = false;
    private Thread counterThread;

    public bai63() {
        setTitle("Pause and Resume Task");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblCount = new JLabel("Count: 0");
        lblCount.setBounds(166, 9, 53, 13);
        btnStart = new JButton("Start");
        btnStart.setBounds(278, 46, 71, 21);
        btnPause = new JButton("Pause");
        btnPause.setBounds(169, 46, 71, 21);
        btnResume = new JButton("Resume");
        btnResume.setBounds(50, 46, 86, 21);
        getContentPane().setLayout(null);

        getContentPane().add(lblCount);
        getContentPane().add(btnStart);
        getContentPane().add(btnPause);
        getContentPane().add(btnResume);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCounting();
            }
        });

        btnPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paused = true;
            }
        });

        btnResume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paused = false;
                synchronized (bai63.this) {
                	bai63.this.notify();
                }
            }
        });
    }

    private void startCounting() {
        if (running) return; 

        running = true;
        counterThread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (bai63.this) {
                    while (paused) {
                        try {
                        	bai63.this.wait(); 
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                count++;
                SwingUtilities.invokeLater(() -> lblCount.setText("Count: " + count));
            }
        });

        counterThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai63().setVisible(true);
        });
    }
}
