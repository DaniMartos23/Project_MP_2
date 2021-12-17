package Aplicació;

import java.util.Date;

public class Dades {

	private String usuari;
	private String recurs;
	private Date data;
	
	
	public Dades(String usuari, String recurs, Date data) {
		this.usuari = usuari;
		this.recurs = recurs;
		this.data = data;
	}
	public String getUsuari() {
		return usuari;
	}
	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}
	public String getRecurs() {
		return recurs;
	}
	public void setRecurs(String recurs) {
		this.recurs = recurs;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	

}
