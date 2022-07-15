package mvc.model;

public class Model {
	private int zahl = 0;

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public int countUp() {
		this.setZahl(this.getZahl()+1);
		return this.getZahl();
	}
	
	public int countDown() {
		this.setZahl(this.getZahl()-1);
		return this.getZahl();
	}
	
}
