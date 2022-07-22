package view.shopping;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ShoppingPanel extends JPanel {

	private List<ArtikelPanel> artikelList;
	private JPanel displayPanel;

	public List<ArtikelPanel> getArtikelList() {
		return artikelList;
	}

	public void setArtikelList(List<ArtikelPanel> artikelList) {
		this.artikelList = artikelList;
	}

	public JPanel getDisplayPanel() {
		return displayPanel;
	}

	public void setDisplayPanel(JPanel displayPanel) {
		this.displayPanel = displayPanel;
	}
	
	public ShoppingPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		this.setBackground(Color.LIGHT_GRAY);
		this.setOpaque(true);

		this.setDisplayPanel(new JPanel());
		this.getDisplayPanel().setLayout(new GridLayout(10,1));
//		this.getDisplayPanel().setBounds(0, 0, 1008, 10000);
//		this.getDisplayPanel().setOpaque(true);
//		this.getDisplayPanel().setBackground(Color.black);
		
		
		JScrollPane sPane = new JScrollPane();
		sPane.setBounds(0, 0, 1008, 618);
		sPane.setViewportView(this.getDisplayPanel());
		this.add(sPane);
		sPane.getVerticalScrollBar().setUnitIncrement(16);
		this.setArtikelList(new ArrayList<>());
		
		for (int i = 0; i < 10; i++) {
			this.getDisplayPanel().add(new ArtikelPanel());
		}
		
	}



}
