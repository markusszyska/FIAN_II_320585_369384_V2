package pak06_tryMitRessourcen;

import java.util.ArrayList;

public class MyAutoClosableArrayList<E> extends ArrayList<E> implements AutoCloseable {

	@Override
	public void close() throws Exception {
		this.clear();
		System.out.println("Liste bereinigt");		
	}

}
