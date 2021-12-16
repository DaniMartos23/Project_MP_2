package Interface;

import java.util.Date;

public interface TADcjtRecursos {
	/**
	 * Afegeix les dades d置na consulta feta a un recurs per un usuari en un moment concret
	 * si el recurs existeix s'afegeixen les dades, si no existeix es crea
	 * @param recurs - el recurs que s'ha d'afegir
	 * @param usuari - l'usuari que fa la consulta
	 * @param data - data quan es fa la consulta
	 * @return codiError: =1 si consulta afegida correctament, =0 si consulta no afegida correctament
	 */
	int afegir_Dades(String recurs, String usuari,Date date);
	
	/**
	 * Esborrar totes les dades d置na consulta a un recurs
	 * @param recurs
	 * @return codiError: =1 si consultes esborrades correctament, =0 si no s'han pogut esborrar,
	 * =-1 si el recurs no existeix
	 */
	int esborrar_Dades(String recurs);
	
	/**
	 * Esborrar totes les dades d置na consulta a un recurs en una data concreta
	 * @param recurs - el recurs d'on s'han d'esborrar les dades
	 * @param data - data concreta de la consulta que s'ha d'esborrar
	 * @return codiError: =1 si consultes esborrades correctament, =0 si no s'han pogut esborrar,
	 * =-1 si el recurs no existeix
	 */
	int esborrar_Dades(String recurs, Date date);
	
	/**
	 * Donat el nom d置n recurs volem un m鑼ode que ens retorni la llista 
	 * d置suaris que l檀an consultat
	 * @param recurs
	 * @return llista_usuaris
	 */
	String[] usuaris_consulta(String recurs);
	
	/**
	 * 
	 */
	String[] usuaris_consulta(String recurs,Date date);
	
	/**
	 * 
	 */
	
}
