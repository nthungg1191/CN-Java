package day29month4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai60 extends JFrame {
    private JProgressBar progressBar;
    private JButton downloadButton;
    private JLabel statusLabel;

    public bai60() {
        setTitle("File Download Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true); 
        add(progressBar);

        statusLabel = new JLabel("Status: Waiting");
        add(statusLabel);

        downloadButton = new JButton("Download");
        add(downloadButton);

        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startDownload();
            }
        });
    }

    private void startDownload() {
        downloadButton.setEnabled(false);
        statusLabel.setText("Status: Downloading...");

        SwingWorker<Void, Integer> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                int progress = 0;
                while (progress <= 100) {
                    Thread.sleep(50); //50ms
                    publish(progress);
                    setProgress(progress);
                    progress++;
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int latestProgress = chunks.get(chunks.size() - 1);
                progressBar.setValue(latestProgress);
            }

            @Override
            protected void done() {
                statusLabel.setText("Status: Download Complete");
                downloadButton.setEnabled(true);
            }
        };

        worker.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai60().setVisible(true);
        });
    }
}
