package day29month4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bai62 extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private int currentId = 1;

    public bai62() {
        setTitle("Real-time JTable Update");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Tạo bảng với cột
        model = new DefaultTableModel(new Object[]{"ID", "Name", "Time"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Bắt đầu thread cập nhật dữ liệu
        startUpdatingTable();
    }

    private void startUpdatingTable() {
        Thread updaterThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000); // Cập nhật mỗi 2 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Thêm dữ liệu mới vào bảng (trong EDT)
                SwingUtilities.invokeLater(() -> {
                    String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
                    model.addRow(new Object[]{currentId++, "Item " + currentId, time});
                });
            }
        });

        updaterThread.setDaemon(true);
        updaterThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai62().setVisible(true);
        });
    }
}
