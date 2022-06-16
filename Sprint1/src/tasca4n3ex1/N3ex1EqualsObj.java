package tasca4n3ex1;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class N3ex1EqualsObj {
	private Object actual;
	private Object esperado;

	public N3ex1EqualsObj(Object actual, Object esperado) {
		this.actual = actual;
		this.esperado = esperado;
	}

	@Parameters
	public static Iterable<Object[]> getData() {

		return Arrays.asList(new Object[][] {
				{ new Persona("Manolo", "El del bombo", 65), new Persona("Manolo", "El del bombo", 65) } });

	}

	// @SuppressWarnings("deprecation")
	@Test
	public void testEqualsObj() {
		// assertThat(actual).isEqualToComparingFieldByFieldRecursively(esperado);

		// OK, aqui no deprecated
		assertThat(actual).isEqualTo(esperado);

	}

	@Test
	public void testNotEqualsObj() {

		assertThat(actual).isNotEqualTo(esperado);
	}
}
