package mvc.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class View extends JFrame{

	private JPanel mainPanel;
	private JPanel centerPanel;
	private JLabel zahlenLabel;
	private JPanel southPanel;
	private JButton btnCountUp, btnCountDown;

	public JPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public JLabel getZahlenLabel() {
		return zahlenLabel;
	}

	public void setZahlenLabel(JLabel zahlenLabel) {
		this.zahlenLabel = zahlenLabel;
	}

	public JPanel getSouthPanel() {
		return southPanel;
	}

	public void setSouthPanel(JPanel southPanel) {
		this.southPanel = southPanel;
	}

	public JButton getBtnCountUp() {
		return btnCountUp;
	}

	public void setBtnCountUp(JButton btnCountUp) {
		this.btnCountUp = btnCountUp;
	}

	public JButton getBtnCountDown() {
		return btnCountDown;
	}

	public void setBtnCountDown(JButton btnCountDown) {
		this.btnCountDown = btnCountDown;
	}

	public View() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 400, 400, 200);
		
		this.setZahlenLabel(new JLabel());
		this.setMainPanel(new JPanel());
		this.setSouthPanel(new JPanel());
		this.setCenterPanel(new JPanel());
		
		this.setContentPane(this.getMainPanel());
		this.getMainPanel().setLayout(new BorderLayout());
		
		this.setBtnCountUp(new JButton("Count Up"));
		this.setBtnCountDown(new JButton("Count Down"));
		this.getBtnCountUp().setActionCommand("Up");
		this.getBtnCountDown().setActionCommand("Down");
		
		
		this.getZahlenLabel().setFont(new Font("Arial", Font.PLAIN, 30));
		this.getZahlenLabel().setText("Hier kommt eine Zahl rein");
		this.getZahlenLabel().setHorizontalAlignment(SwingConstants.CENTER);
		this.getZahlenLabel().setVerticalAlignment(SwingConstants.CENTER);
		
		this.getCenterPanel().add(this.getZahlenLabel());
		
		this.getSouthPanel().add(this.getBtnCountDown());
		this.getSouthPanel().add(this.getBtnCountUp());
		
		this.getMainPanel().add(this.getCenterPanel(), BorderLayout.CENTER);
		this.getMainPanel().add(this.getSouthPanel(), BorderLayout.SOUTH);
		
		this.setTitle("Mein Counter");
		this.setVisible(true);		
		
	}
	
	public void addActionListenerToButtons(ActionListener al) {
		this.getBtnCountUp().addActionListener(al);
		this.getBtnCountDown().addActionListener(al);
	}

	public void displayValue(int wert) {
		this.getZahlenLabel().setText("" + wert);
	}
	
}
