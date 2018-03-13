package it.consoft.nameless.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "motocomposta")
public class MotoComposta {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "motoId")
	private Moto moto;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
	private Set<Componente> listComponenti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public Set<Componente> getListComponenti() {
		return listComponenti;
	}

	public void setListComponenti(Set<Componente> listComponenti) {
		this.listComponenti = listComponenti;
	}

	@Override
	public String toString() {
		return "MotoComposta [id=" + id + ", user=" + user + ", moto=" + moto + ", listComponenti=" + listComponenti
				+ "]";
	}

}
