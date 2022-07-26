package wdh;

public class Network {
	int id;
	Network p;
	
	Network(int x, Network n) {
		id = x;
		p = this;
		if (n != null)
			p = n;
	}

	public static void main(String[] args) {
		Network n1 = new Network(1, null);
		n1.go(n1);
		
		Person2 p1 = new Person2();	
		p1.p = p1;
		
		System.out.println(p1.p.p.p.p.p.p == p1.p.p.p.p); //true
	}

	void go(Network n1) {
		Network n2 = new Network(2, n1);
		Network n3 = new Network(3, n2);
		System.out.println(n3.p.p.id);
	}
}

class Person2{
	Person2 p;
}
