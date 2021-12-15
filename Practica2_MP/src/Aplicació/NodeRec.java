package Aplicació;

import java.util.Date;

public class NodeRec {
	private String m_nom;
	private Node m_dades;
	private NodeRec seguent;
	
	public NodeRec() {
		m_nom=null;
		m_dades=null;
		seguent=null;
	}
	
	public NodeRec(String nom,String usuari,Date date) {
		this.m_nom=nom;
		this.m_dades=new Node(usuari,date);
		seguent=null;
	}

	public String getNom() {
		return m_nom;
	}

	public void setNom(String nom ) {
		this.m_nom = nom;
	}
	
	public Node getDades() {
		return m_dades;
	}

	public void setDades(String usuari,Date date ) {
		this.m_dades=new Node(usuari,date);
	}
	
	public NodeRec getSeguent() {
		return seguent;
	}

	public void setSeguent(NodeRec seguent) {
		this.seguent = seguent;
	}
	
	
}
