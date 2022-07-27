package view.main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
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
		/**
		 * @toDo
		 * Benannte Kategorien
		 */
		String[] menues = {"Kat 1", "Kat 2" , "Kat 3"};

		Arrays.stream(menues).forEach(s-> this.getMenuList().add(new JButton(s)));
		
		this.getMenuList().forEach(item->this.add(item));
		
		
		
		
		
	}
	
}
