package it.consoft.nameless.model;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "nickname", unique = true)
	private String nickname;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "eta")
	private int eta;

	@Column(name = "indirizzo")
	private String indirizzo;

	@Column(name = "foto")
	private String foto;

	@Column(name = "dataIscrizione")
	private String dataIscrizione;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	private Set<Moto> listMoto;

	@Column(name = "credito")
	private float credito;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDataIscrizione() {
		return dataIscrizione;
	}

	public void setDataIscrizione(String dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	public Set<Moto> getListMoto() {
		return listMoto;
	}

	public void setListMoto(Set<Moto> listMoto) {
		this.listMoto = listMoto;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname + ", nome=" + nome + ", cognome="
				+ cognome + ", eta=" + eta + ", indirizzo=" + indirizzo + ", foto=" + foto + ", dataIscrizione=" + dataIscrizione
				+ ", listMoto=" + listMoto + ", credito=" + credito + "]";
	}

}