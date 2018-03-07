package it.consoft.nameless.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	int id;
	
	private String username;
	private String password;
	private String nickname;
	private int eta;
	private String foto;
	private String dataIscrizione;
	private List<Moto> listMoto;
	private int credito;

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

	public List<Moto> getListMoto() {
		return listMoto;
	}

	public void setListMoto(List<Moto> listMoto) {
		this.listMoto = listMoto;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", eta=" + eta + ", foto=" + foto + ", dataIscrizione=" + dataIscrizione + ", credito=" + credito
				+ "]";
	}

	
}