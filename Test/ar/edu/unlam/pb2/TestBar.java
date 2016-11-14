package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestBar {
	
	private Bar miBar;
	
	@Before
	public void init()
	{
		miBar = new Bar();
		TreeSet personas = new TreeSet<Persona>();
		miBar.setPersonas(personas);
	}
	
	@Test
	public void testCrearUnBarVacio()
	{
		miBar = new Bar();
		Assert.assertTrue(0 == miBar.obtenerCantidadDePersonas());
	}
	

	@Test
	public void testIngresaPersona() throws Exception
	{
		miBar.admitirPersona(new Persona("Andres"));
	}	

}
