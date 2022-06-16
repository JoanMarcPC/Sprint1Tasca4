package tasca4n3ex4;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import tasca4n3ex1.Persona;

@RunWith(value = Parameterized.class)

public class N3ex4ArrayAsertions {
	private ArrayList<Object> actual;
	private Persona p1;
	private int num;
	private String paraula;
	private double num2;

	public N3ex4ArrayAsertions(ArrayList<Object> actual, Persona p1, int num, String paraula, double num2) {
		this.actual = actual;
		this.p1 = p1;
		this.num = num;
		this.paraula = paraula;
		this.num2 = num2;
	}

	@Parameters
	public static Iterable<Object[]> getData() {

		Persona p1 = new Persona("Boticaria", "de los Monteros", 1);
		int num = 1;
		String paraula = "Hola";
		double num2 = 23.4;
		ArrayList<Object> lista = new ArrayList<Object>();
		lista.add(p1);
		lista.add(num);
		lista.add(paraula);
		lista.add(num2);

		return Arrays.asList(new Object[][] { { lista, p1, num, paraula, num2 } });

	}

	// https://www.javadoc.io/static/org.assertj/assertj-core/3.2.0/org/assertj/core/api/AbstractObjectArrayAssert.html#containsSequence-T...-
	@Test
	public void testArrayOrder() {

		assertThat(actual).containsSequence(p1, num, paraula, num2);
		// o
		assertThat(actual).containsExactly(p1, num, paraula, num2);

	}

	@Test
	public void testArrayWitoutOrder() {

		assertThat(actual).contains(p1, num, paraula, num2);

	}

}