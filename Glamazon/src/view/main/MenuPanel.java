package view.main;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{

	private List<JButton> menuList;

	public List<JButton> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<JButton> menuList) {
		this.menuList = menuList;
	}

	public MenuPanel() {
		this.setBounds(0, 120, 1024, 30);
		this.setBackground(Color.DARK_GRAY);
		this.setOpaque(true);
		this.setMenuList(new ArrayList<>());
	}
	public void addKategorieBtn(Set<String> alleKategorien) {
		alleKategorien.forEach(s-> this.getMenuList().add(new JButton(s)));
		this.getMenuList().add(new JButton("Alle Artikel"));
		this.getMenuList().forEach(item->this.add(item));
		this.revalidate();
		this.repaint();
	}
	public void addActionListenerToKategorieBtn(ActionListener al) {
		this.getMenuList().forEach(btn->btn.addActionListener(al));
	}

}
