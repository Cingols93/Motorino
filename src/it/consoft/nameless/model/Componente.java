package it.consoft.nameless.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "componente")
public class Componente {

	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "marca")
	private String marca;

	@Column(name = "velocita")
	private float velocita;

	@Column(name = "frenata")
	private float frenata;

	@Column(name = "manovrabilita")
	private float manovrabilita;

	@Column(name = "accellerazione")
	private float accellerazione;

	@Column(name = "prezzo")
	private float prezzo;

	@Column(name = "antifurto")
	private boolean antifurto;

	public int getIdcomp() {
		return id;
	}

	public void setIdcomp(int idcomp) {
		this.id = idcomp;
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
