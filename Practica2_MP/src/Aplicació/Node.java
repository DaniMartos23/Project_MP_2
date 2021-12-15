package Aplicació;

import java.util.Date;

public class Node {
	private String m_usuari;
	private Date m_date;
	private Node seguent;
	
	public Node() {
		m_usuari=null;
		m_date=null;
		seguent=null;
	}
	
	public Node(String usuari,Date date) {
		this.m_usuari=usuari;
		this.m_date=date;
		seguent=null;
	}

	public String getUsuari() {
		return m_usuari;
	}

	public void setUsuari(String usuari) {
		this.m_usuari = usuari;
	}
	
	public Date getDate() {
		return m_date;
	}
	
	public void setDate(Date date) {
		this.m_date = date;
	}

	public Node getSeguent() {
		return seguent;
	}

	public void setSeguent(Node seguent) {
		this.seguent = seguent;
	}
	
	
}
