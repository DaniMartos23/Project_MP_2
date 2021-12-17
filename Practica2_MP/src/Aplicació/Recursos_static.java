package Aplicació;

import java.util.Date;

import Interface.TADcjtRecursos;
import classes.RegistreEsportiu;
import Aplicació.Dades;

public class Recursos_static implements TADcjtRecursos {
	
	private Dades[] info;
	
	public Recursos_static(){
		info= new Dades[0];
	}

	@Override
	public int afegir_Dades(String recurs, String usuari, Date data) {
		Dades nou = new Dades(recurs,usuari,data);
		return 0;
	}

	@Override
	public int esborrar_Dades(String recurs) {
		// TODO Auto-generated method stub
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
