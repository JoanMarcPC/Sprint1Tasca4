package tasca4n3ex2;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import tasca4n3ex1.Persona;

@RunWith(value = Parameterized.class)

public class N3ex2EqualsRefObj {
	private Object actual;
	private Object esperado;

	public N3ex2EqualsRefObj(Object actual, Object esperado) {
		this.actual = actual;
		this.esperado = esperado;
	}

	@Parameters
	public static Iterable<Object[]> getData() {

		Persona p1 = new Persona("Has vist", "que ben parametritzat?", 1);
		Persona p2 = p1;
		p2.setCognom(":)"); // es canvia a p1 també

		return Arrays.asList(new Object[][] { { p1, p2 } });

	}

	@Test
	public void testSameObj() {

		assertThat(actual).isSameAs(esperado);

	}

	@Test
	public void testNotSameObj() {

		assertThat(actual).isNotSameAs(esperado);

	}

}