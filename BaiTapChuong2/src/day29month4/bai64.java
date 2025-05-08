package day29month4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai64 extends JFrame {
    private JLabel lblStatus;
    private JButton btnRunTask;

    public bai64() {
        setTitle("Thread Error Demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        lblStatus = new JLabel("Status: Ready");
        btnRunTask = new JButton("Run Task");

        add(lblStatus);
        add(btnRunTask);

        btnRunTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runTaskWithError();
            }
        });
    }

    private void runTaskWithError() {
        lblStatus.setText("Status: Running...");

        // Tạo Thread giả lập lỗi
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);

                throw new RuntimeException("Đã xảy ra lỗi trong tác vụ!");
            } catch (Exception ex) {
                
                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(bai64.this,
                            ex.getMessage(),
                            "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                    lblStatus.setText("Status: Error");
                });
            }
        });

        thread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai64().setVisible(true);
        });
    }
}
