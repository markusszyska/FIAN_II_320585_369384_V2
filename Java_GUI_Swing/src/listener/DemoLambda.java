package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
	public static void main(String[] args) {
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
								
			}
		};
		
		ActionListener al2 = e ->{ };
		
		List<String> list = new ArrayList<>();
		list.add("Markus");
		list.add("Christian");
		list.add("Max");
		list.add("Christa");
		System.out.println(list);
		
		Predicate<String> pred = (String s) -> {return s.equals("Markus");}; 
		Predicate<String> pred2 = new Predicate<>() {
			@Override
			public boolean test(String t) {
				return false;
			}			
		};
		
		System.out.println(pred.test(list.get(0)));
		
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equals("Markus")) {
//				list.remove(i);
//			}
//		}
		
		list.removeIf(s->s.equals("Markus"));
		System.out.println(list);
		
		list.forEach(s-> System.out.println(s.concat("chen")));
		Consumer<String> con;
		Supplier<String> sup;
		Function<String, Integer> func;
		
	}
}
