package components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class Demo15_JProgressBar {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.setTitle("Demo15JTable");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(null);

		JProgressBar bar = new JProgressBar(0, 100);
		bar.setValue(0);
		bar.setStringPainted(true);
		bar.setBounds(170, 100, 300, 40);
		panel.add(bar);

		JButton btn = new JButton("Start");
		btn.setBounds(270, 330, 100, 50);
		panel.add(btn);

		btn.addActionListener(e -> {
			new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
				}
					bar.setValue(i);
					bar.repaint();
				System.out.println("Schleife laeuft");
			}
			}).start();

		});

//		frame.setResizable(false);
		frame.setVisible(true);

	}
}
