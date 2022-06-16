package tasca4n3ex6;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ExceptionAssert {

	@Test
	public void testClassException() {
		assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {
			ClaseExcepcio.lanzarExcepcion();
		});

	}

	// o simplement si salta algo
	@Test
	public void testException() {
		assertThatThrownBy(() -> {
			ClaseExcepcio.lanzarExcepcion();
		});
	}

}
