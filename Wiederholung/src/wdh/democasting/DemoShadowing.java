package wdh.democasting;

public class DemoShadowing {
	String text ;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public static void main(String[] args) {
		Mutter m = new Tochter();
		System.out.println(m.name); //Mutter
		System.out.println(((Tochter)m).name); //Tochter
		
		
		Tochter t = new Tochter();
		System.out.println(t.name); //Tochter
		t.setName("Name geaendert");
		System.out.println(t.name); //Name geaendert? Tochter?
	}
}

class Mutter{
	String name = "Mutter";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Mutter() {
		super();
	}
	
}
class Tochter extends Mutter{
	String name = "Tochter";
	public Tochter() {
		super();
	}
}
