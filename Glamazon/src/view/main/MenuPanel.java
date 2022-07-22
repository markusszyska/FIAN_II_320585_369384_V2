package view.main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	
	private JMenuBar menuBar;
	private List<JMenu> menuList;
	
	public JMenuBar getMenuBar() {
		return menuBar;
	}
	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}
	public List<JMenu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<JMenu> menuList) {
		this.menuList = menuList;
	}
	
	public MenuPanel() {
		this.setBounds(0, 120, 1024, 30);
		this.setLayout(null);
		this.setBackground(Color.DARK_GRAY);
		this.setOpaque(true);
		
		this.setMenuBar(new JMenuBar());
		this.getMenuBar().setBounds(0, 0, 1024, 30);
		this.setMenuList(new ArrayList<>());
		String[] menues = {"Kat 1", "Kat 2" , "Kat 3"};
//		for(String s : menues) {
//			this.getMenuBar().add(new JMenu(s));
//		}
		Arrays.stream(menues).forEach(s-> this.getMenuBar().add(new JMenu(s)));
		
//		for(JMenu m : this.getMenuList()) {
//			this.getMenuBar().add(m);
//		}
		this.getMenuList().forEach(item->this.getMenuBar().add(item));
		
		this.add(this.getMenuBar());
		
		
		
	}
	
}
