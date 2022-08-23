package view.main;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	private JButton btnStart;

	public JButton getBtnStart() {
		return btnStart;
	}

	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}

	public StartPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		this.setBackground(Color.DARK_GRAY);

		this.setBtnStart(new JButton("Shopping beginnen"));
		this.getBtnStart().setBounds(437, 600, 150, 35);
		this.add(this.getBtnStart());
	}

	public void addActionListenerToStartButton(ActionListener al) {
		this.getBtnStart().addActionListener(al);
	}
}
