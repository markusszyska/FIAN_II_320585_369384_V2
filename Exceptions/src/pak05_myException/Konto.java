package pak05_myException;

public class Konto {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Konto(double saldo) {
		this.setSaldo(saldo);
	}
	/**
	 * 
	 * @param betrag
	 * @return geldbetrag
	 * @throws NegativSaldoException
	 */
	public double geldAbheben(double betrag) throws NegativSaldoException {
		if(betrag > this.getSaldo()) {
			throw new NegativSaldoException("Nicht genug Geld auf dem Konto. Es sind nur " + this.getSaldo()+ " € auf dem Konto",this);
		}else{
			this.setSaldo(this.getSaldo() - betrag);			
		}
		return betrag;
	}
	
	
	@Override
	public String toString() {
		return "Saldo verfuegbar: " + saldo;
	}
	
	
}
