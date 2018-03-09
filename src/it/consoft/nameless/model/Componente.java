package it.consoft.nameless.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Componente {
 
	@Id
	@GeneratedValue
	int idcomp;

	private String nome;
	private String marca;
	private float velocita;
	private float frenata;
	private float manovrabilita;
	private float accellerazione;
	private float prezzo;
	private boolean antifurto;

	public int getIdcomp() {
		return idcomp;
	}

	public void setIdcomp(int idcomp) {
		this.idcomp = idcomp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public float getFrenata() {
		return frenata;
	}

	public void setFrenata(float frenata) {
		this.frenata = frenata;
	}

	public float getManovrabilita() {
		return manovrabilita;
	}

	public void setManovrabilita(float manovrabilita) {
		this.manovrabilita = manovrabilita;
	}

	public float getAccellerazione() {
		return accellerazione;
	}

	public void setAccellerazione(float accellerazione) {
		this.accellerazione = accellerazione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isAntifurto() {
		return antifurto;
	}

	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
	}

}
