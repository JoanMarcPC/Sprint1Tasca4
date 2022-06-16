package tasca4n1ex1;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;

class JunitTest {
	private  Junit object; 

	@BeforeEach  // la before del video no em va, suposo que es tema de versions(SI), BeforeAll per fer-ho nomes 1 cop
	public  void before() {
		
		this.object = new Junit();
		this.object.addMonths();
		
	}
	
	@AfterEach
	public void after() {
		this.object = null;
	}
	
	@Test
	void testNull() {
		
		
		for (String month:object.getMonths()) {
			assertNotNull(month); // ja faig servir el assert que toca, crec ¬¬
		}

	}
	@Test
	void testSize() {
		assertEquals(12,object.getMonths().size());
	}
			
	@Test
	void testAgost() {
		assertEquals("Agost",object.getMonths().get(7)); // ja faig servir el assert que toca ¬¬
	}
	// no usar el assertEquals (double,double)
	// hay que usar el assertEquals(double,double,double)
	// el 3r double (delta)  representa el margen de error permitido para ser "Equals"
	
}
