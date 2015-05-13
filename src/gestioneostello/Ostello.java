package gestioneostello;

import java.util.Vector;

public class Ostello {
	private String nome;
	private Vector<Stanza> stanze;
	
	public Ostello(String nome) {
		this.nome = nome;
		this.stanze = new Vector<Stanza>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Vector<Stanza> getStanze() {
		return stanze;
	}

	public void setStanze(Vector<Stanza> stanze) {
		this.stanze = stanze;
	}

}
