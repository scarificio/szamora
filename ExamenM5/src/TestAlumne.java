import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestAlumne {
	Alumne alum1;
	Alumne alum2;
	Alumne alum3;
	
	@Before
	public void setUp() throws Exception {
		alum1 = new Alumne("Samuel", 32, 2017, 10, 5);
		alum2 = new Alumne("Pol", 26, 2017, 7, 7);
		alum3 = new Alumne("Enric", 20, 2017, 2, 3);
	}


	@Test
	public void testEsMajorEdat() {		
	 assertTrue("Es menor d'edat, i habia de ser major", alum1.esMajorEdat());
	 assertTrue("Es menor d'edat, i habia de ser major", alum2.esMajorEdat());
	 assertFalse("Es major d'edat, i habia de ser menor", alum3.esMajorEdat());
	}


	@Test
	public void testAprovaM5() {
	assertFalse("Aprovat, pero havia d'aprovar per nota", alum1.aprovaM5(80));
	assertFalse("Aprovat, pero habia de suspendre per assistencia", alum2.aprovaM5(60));
	assertTrue("Suspes i habia d'aprovar", alum3.aprovaM5(90));
	}

	@Test
	public void testAnysMatriculat() {
		
	}
	
	@Test
	public void testPassaASegon() {
		
	}

}
