package tasca4n3ex3;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import tasca4n3ex1.Persona;

@RunWith(value = Parameterized.class)

public class N3ex3ArrayAsertions {
	private ArrayList<Integer> actual;
	private ArrayList<Integer> esperado;

	public N3ex3ArrayAsertions(ArrayList<Integer> actual, ArrayList<Integer> esperado) {
		this.actual = actual;
		this.esperado = esperado;
	}

	@Parameters
	public static Iterable<Object[]> getData() {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);

		return Arrays.asList(new Object[][] { { lista, lista2 } });

	}

	// https://www.javadoc.io/static/org.assertj/assertj-core/3.2.0/org/assertj/core/api/AbstractObjectArrayAssert.html#containsSequence-T...-
	@Test
	public void testArrayInt() {

		assertThat(actual).containsExactlyElementsOf(esperado);
		// o
		;

	}

}