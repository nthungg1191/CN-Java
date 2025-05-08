package day24mon4;

import java.awt.EventQueue;
import javax.swing.*;

public class bai31 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bai31 window = new bai31();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public bai31() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("JSplitPane Example");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] items = {"Item 1", "Item 2", "Item 3"};
		JList<String> list = new JList<>(items);
		JTextArea textArea = new JTextArea();

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(list), new JScrollPane(textArea));
		splitPane.setDividerLocation(200);

		frame.getContentPane().add(splitPane);
	}
}
