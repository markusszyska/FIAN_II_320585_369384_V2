package wdh.interfaces.connections;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		DataProvider dp = new DataProvider();
		System.out.println(dp.getAllData());
		
	}
}
