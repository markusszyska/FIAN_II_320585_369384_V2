package view.warenkorb;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.data.Warenkorb;

public class WarenkorbPanel extends JPanel {
	private WarenkorbHeader wkHeader;
	private JPanel cartPanel;
	private List<WarenkorbPanelItem> cartItems;

	public WarenkorbHeader getWkHeader() {
		return wkHeader;
	}

	public void setWkHeader(WarenkorbHeader wkHeader) {
		this.wkHeader = wkHeader;
	}

	public JPanel getCartPanel() {
		return cartPanel;
	}

	public void setCartPanel(JPanel cartPanel) {
		this.cartPanel = cartPanel;
	}

	public List<WarenkorbPanelItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<WarenkorbPanelItem> cartItems) {
		this.cartItems = cartItems;
	}

	public WarenkorbPanel() {
		this.setBounds(0, 150, 1008, 579);
		this.setLayout(null);

		this.setWkHeader(new WarenkorbHeader());
		this.add(this.getWkHeader());

		this.setCartItems(new ArrayList<>());
		for (int i = 0; i < 10; i++) {
			this.getCartItems().add(new WarenkorbPanelItem());
		}
		this.setCartPanel(new JPanel());
		this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));

		JScrollPane scrollPane = new JScrollPane(this.getCartPanel());
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBounds(0, 40, 1008, 540);
		this.add(scrollPane);

//		this.getCartItems().forEach(item-> this.getCartPanel().add(item));
		for (WarenkorbPanelItem element : this.getCartItems()) {
			this.getCartPanel().add(element);
		}

	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkHeader().addActionListenerToBtnKasse(al);
	}

	public void aktualisiereWarenKorbView(Warenkorb warenkorb) {
		this.getCartPanel().removeAll();
		this.getCartItems().clear();
		System.out.println(warenkorb.getPositionen());
		warenkorb.getPositionen().forEach(pos -> this.getCartItems().add(new WarenkorbPanelItem(pos)));
		if (this.getCartItems().size() > 0)
			this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));
		else
			this.getCartPanel().setLayout(new GridLayout(1, 0));
		this.getCartItems().forEach(item->this.getCartPanel().add(item));
		System.out.println(this.getCartItems().size());
		this.getCartPanel().revalidate();
		this.getCartPanel().repaint();
	}

}
