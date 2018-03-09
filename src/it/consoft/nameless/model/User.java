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
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	int id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "eta")
	private int eta;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", eta=" + eta + ", foto=" + foto + ", dataIscrizione=" + dataIscrizione + ", credito=" + credito
				+ "]";
	}

}