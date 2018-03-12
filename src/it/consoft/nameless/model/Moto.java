package it.consoft.nameless.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto {
 
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String marca;

	@Column(name="modello")
	private String modello;

	@Column(name="cilindrata")
	private int cilindrata;

	@Column(name="cavalli")
	private float cavalli;

	@Column(name="velocita")
	private float velocita;

	@Column(name="colore")
	@Enumerated(EnumType.STRING)
	private ColoreEnum colore;

	@Column(name="tipo")
	@Enumerated(EnumType.STRING)
	private TipoMotoEnum tipo;

	private float accelerazione;

	private float manovrabilita;

	private float frenata;

	private float prezzo;

	private boolean antifurto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public float getCavalli() {
		return cavalli;
	}

	public void setCavalli(float cavalli) {
		this.cavalli = cavalli;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public ColoreEnum getColore() {
		return colore;
	}

	public void setColore(ColoreEnum colore) {
		this.colore = colore;
	}

	public TipoMotoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoMotoEnum tipo) {
		this.tipo = tipo;
	}

	public float getAccelerazione() {
		return accelerazione;
	}

	public void setAccelerazione(float accelerazione) {
		this.accelerazione = accelerazione;
	}

	public float getManovrabilita() {
		return manovrabilita;
	}

	public void setManovrabilita(float manovrabilita) {
		this.manovrabilita = manovrabilita;
	}

	public float getFrenata() {
		return frenata;
	}

	public void setFrenata(float frenata) {
		this.frenata = frenata;
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

	@Override
	public String toString() {
		return "Moto [id=" + id + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", cavalli=" + cavalli + ", velocita=" + velocita + ", colore=" + colore + ", tipo=" + tipo
				+ ", accelerazione=" + accelerazione + ", manovrabilita=" + manovrabilita + ", frenata=" + frenata
				+ ", prezzo=" + prezzo + ", antifurto=" + antifurto + "]";
	}
	
	

}