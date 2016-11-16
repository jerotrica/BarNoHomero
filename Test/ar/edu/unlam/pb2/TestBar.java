package ar.edu.unlam.pb2;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestBar {
	
	private Bar miBar;
	
	@Before
	public void init()
	{
		miBar = new Bar();
		TreeSet<Carga> personas = new TreeSet<Carga>();
		miBar.setPersonas(personas);
	}
	
	@Test
	public void testCrearUnBarVacio()
	{
	
		Assert.assertTrue(0 == miBar.obtenerCantidadDePersonas());
	}


	@Test
	public void testIngresaPersona() throws Exception
	{
		miBar.admitirPersona(new Carga("Andres"));
		Assert.assertTrue(1 == miBar.obtenerCantidadDePersonas());
	}	
	
	@Test(expected = Exception.class)
	public void testNoPersonaRepetida() throws Exception
	{
		miBar.admitirPersona(new Carga("Mirta"));
		miBar.admitirPersona(new Carga("Romaria"));
	}
	
	@Test
	public void testPersonaOrdenadaPorNombre() throws Exception
	{
		miBar.admitirPersona(new Carga("Pepe"));
		miBar.admitirPersona(new Carga("Agus"));
		miBar.admitirPersona(new Carga("Federico"));
		int i = 0;
		for(Iterator<Carga> it = miBar.getPersonas().iterator(); it.hasNext();)
		{
			Carga each = it.next();
			switch(i)
			{
			case 0:
				Assert.assertTrue("Pepe".equals(each.getNombre()));
				break;
			case 1:
				Assert.assertTrue("Agus".equals(each.getNombre()));
				break;
			case 2:
				Assert.assertTrue("Fede".equals(each.getNombre()));
				break;
			}
			i++;
		}
	}
	
	// CALCULAR SUMATORIA DE EDADES Y PROMEDIO DEEDADES 
	// SUMATORIA DE UN MONTACARGAS, LRECORRER ESA COLECCION E IR TOMANDO POR CADA OBJETO LA EDAD Y SUMARLA
	// SI LE PEDIMOS EL PROMEDIO; RECORRE TODO SUMANDO Y DIVIDIMOS POR EL .SIZE
	// IMPLEMENTAR COMPARABLE , DESARROLLAR EL METODO COMPARETO PARA QUE LA COLECCION SEPA ORDENAR
	// SI NO NECESITAMOS UNA COLECCION ORDENADA; NO NECESITAMOS EL METODO COMPARABLE
	// ITERAR CADA OBJETO DE LA COLECCION , Y HACER UNA OPERACION MATEMATICA.
}
