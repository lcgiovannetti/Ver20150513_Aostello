package gestioneostello;
import java.time.*;
public class Prenotazione {
	private LocalDateTime arrivo;
	private LocalDateTime partenza;	
	private LocalDateTime oraArrivo;
	
	public Prenotazione(LocalDateTime arrivo, LocalDateTime partenza,
			LocalDateTime oraArrivo) {
		this.arrivo = arrivo;
		this.partenza = partenza;
		this.oraArrivo = oraArrivo;
	}

	public LocalDateTime getArrivo() {
		return arrivo;
	}

	public LocalDateTime getPartenza() {
		return partenza;
	}

	public LocalDateTime getOraArrivo() {
		return oraArrivo;
	}
	
	public Cliente getCliente(Cliente c){
		return c;
	}
	public LocalDateTime getNumeroGiorni(){
		return null;
		
	}
	
	
		
	
	


}
