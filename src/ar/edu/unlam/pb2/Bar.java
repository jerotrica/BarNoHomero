package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Bar {
	
	private TreeSet<Persona> personas; 
	
	public Integer obtenerCantidadDePersonas()
	{
		return this.personas.size();
	}

}
