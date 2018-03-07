package it.consoft.nameless.model;

import java.util.List;

public class MotoComposta {
	private int id;
	
	private int idUtente;
	
	private int idMoto;
	
	private List<Integer> listComponenti;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int getIdMoto() {
		return idMoto;
	}

	public void setIdMoto(int idMoto) {
		this.idMoto = idMoto;
	}

	public List<Integer> getListComponenti() {
		return listComponenti;
	}

	public void setListComponenti(List<Integer> listComponenti) {
		this.listComponenti = listComponenti;
	}

	@Override
	public String toString() {
		return "MotoComposta [id=" + id + ", idUtente=" + idUtente + ", idMoto=" + idMoto + ", listComponenti="
				+ listComponenti + "]";
	}
	
}
