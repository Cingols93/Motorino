package it.consoft.nameless.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
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

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<MotoComposta> listMoto;

	@Column(name = "credito")
	private float credito;

	@Column(name = "role")
	private TipoUserEnum role;

	@Transient
	private Set<MotoComposta> carrello;

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

	public Set<MotoComposta> getListMoto() {
		return listMoto;
	}

	public void setListMoto(Set<MotoComposta> listMoto) {
		this.listMoto = listMoto;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

	public TipoUserEnum getRole() {
		return role;
	}

	public void setRole(TipoUserEnum role) {
		this.role = role;
	}

	public Set<MotoComposta> getCarrello() {
		return carrello;
	}

	public void setCarrello(Set<MotoComposta> carrello) {
		this.carrello = carrello;
	}

	public void addToCarrello(MotoComposta mc) {
		this.carrello.add(mc);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", nickname=" + nickname + ", nome="
				+ nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzo=" + indirizzo + ", foto=" + foto
				+ ", dataIscrizione=" + dataIscrizione + ", listMoto=" + listMoto + ", credito=" + credito + "]";
	}

}