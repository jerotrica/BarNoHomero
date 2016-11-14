package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Bar {
	
	private TreeSet<Persona> personas; 
	
	public Integer obtenerCantidadDePersonas()
	{
		return this.personas.size();
	}
	
	public void admitirPersona(Persona personas) throws Exception
	{
		if(!this.personas.add(personas));
		{
			throw new Exception("No se admite");
		}
	}

	public TreeSet<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(TreeSet<Persona> personas) {
		this.personas = personas;
	}
	

}
