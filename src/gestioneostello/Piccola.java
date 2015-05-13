package gestioneostello;

public class Piccola extends Stanza{
	private double costoGiornaliero;

	public Piccola(String numero, int capienza, double costoGiornaliero) {
		super(numero, capienza);
		this.costoGiornaliero = costoGiornaliero;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

}
