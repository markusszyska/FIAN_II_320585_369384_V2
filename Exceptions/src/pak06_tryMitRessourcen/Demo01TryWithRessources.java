package pak06_tryMitRessourcen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo01TryWithRessources {
	public static void main(String[] args) {
//		demoWithoutRessources();
//		demoWithRessources();	
		
		demoWithOwnRessources01();
	}

	private static void demoWithOwnRessources01() {
		try(var al = new MyAutoClosableArrayList<String>()){
			al.add("Hallo");
			al.add("Welt");
			
			al.forEach(System.out::println);
		}catch(Exception e) {
			
		}

	}

	private static void demoWithRessources() {
		File f = new File("c:\\Java\\test.txt");
		try(FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)){
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void demoWithoutRessources() {
		File f = new File("c:\\Java\\test.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
