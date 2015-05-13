package gestioneostello;

public class Grande extends Stanza{
	private double costoGiornaliero;

	public Grande(String numero, int capienza, double costoGiornaliero) {
		super(numero, capienza);
		this.costoGiornaliero = costoGiornaliero;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

}
