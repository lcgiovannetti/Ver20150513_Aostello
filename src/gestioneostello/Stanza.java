package gestioneostello;

import java.util.*;
import java.time.*;

public class Stanza {
	private String numero;
	private int capienza;
	private Vector<Prenotazione> Prenotazioni;
	
	public Stanza(String numero, int capienza) {
		this.numero = numero;
		this.capienza = capienza;
		this.Prenotazioni = new Vector<Prenotazione>();
	}
	
	public boolean isDisponibile(LocalDateTime arrivo, LocalDateTime partenza, int capienza){
		boolean c = false;
		Stanza s;
		for(Prenotazione p: Prenotazioni)
			if(!arrivo.isAfter(p.getPartenza()) && partenza.isBefore(p.getArrivo()))
				c=true;
		
		
		return c;
		
	}
	
	public void addPrenotazione(Prenotazione p){
		
		
	}

	public String getNumero() {
		return numero;
	}

	public int getCapienza() {
		return capienza;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return Prenotazioni;
	}
	
	public double getRicavoTotale(){
		return 0;
		
	}

}
