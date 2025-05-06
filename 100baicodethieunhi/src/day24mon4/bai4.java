package day24mon4;

import javax.swing.*;
import java.awt.*;

public class bai4 extends JFrame {
    public bai4() {
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\19nov\\Downloads");

        JLabel label = new JLabel(imageIcon);
        add(label);
        pack(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai4().setVisible(true);
        });
    }
}
