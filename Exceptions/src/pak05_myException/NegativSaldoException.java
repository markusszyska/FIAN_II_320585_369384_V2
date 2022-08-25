package pak05_myException;

public class NegativSaldoException extends Exception {

	private Konto konto;

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public NegativSaldoException(String message, Konto k) {
		super(message);
		this.setKonto(k);
	}
}
