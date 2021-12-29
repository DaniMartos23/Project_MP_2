package Aplicació;
import java.util.Date;
import Interface.TADcjtRecursos;

public class Recursos_dinamic implements TADcjtRecursos{

	private NodeRec m_recurs;
	private int m_nrecurs;
	
	public Recursos_dinamic () {
		m_recurs=new NodeRec();
		m_nrecurs=0;
	}
	public Recursos_dinamic (String recurs, String usuari, Date date) {
		m_recurs=new NodeRec(recurs,usuari,date);
		m_nrecurs++;
	}
	@Override
	public int afegir_Dades(String recurs, String usuari, Date date) {
		// TODO Auto-generated method stub
		NodeRec aux= new NodeRec(recurs, usuari, date);
		if(m_nrecurs!=0) {
			aux.setSeguent(m_recurs);
		}
		m_recurs=aux;
		m_nrecurs++;
		return 0;
	}

	@Override
	public int esborrar_Dades(String recurs) {
		if(recurs==m_recurs.getNom()) {
			m_recurs=m_recurs.getSeguent();
		}
		else {
			NodeRec prev = m_recurs;
			NodeRec actual= m_recurs.getSeguent();
			for(int i=1;i<m_nrecurs;i++) {
				if(actual.getNom()==recurs) { 
					prev.setSeguent(actual.getSeguent());
					break;
				}
				else {
					prev=actual;
					actual=actual.getSeguent();
				}
		
			}
			
		}
		m_nrecurs--;
		return 0;
	}

	@Override
	public int esborrar_Dades(String recurs, Date date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] usuaris_consulta(String recurs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] usuaris_consulta(String recurs, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
