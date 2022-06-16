package tasca4n3ex7;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class OptionalAssert {
	private Optional<String> actual;

	public OptionalAssert(Optional<String> actual) {
		this.actual = actual;

	}

	@Parameters
	public static Iterable<Object[]> getData() {
		boolean OptionalLleno = false;
		Optional<String> hola = FerOptional.busquedaQuePuedeDarNull(OptionalLleno);

		return Arrays.asList(new Object[][] { { hola } });

	}

	@Test
	public void testOptionalNull() {

		assertThat(actual).isEmpty();
		// casi fico isNull pero he llegit
		// API Note:Though it may be tempting to do so, avoid testing if an object is
		// emptyby comparing with == or != against instances returned by
		// Optional.empty().
		// There is no guarantee that it is a singleton.Instead, use isEmpty() or
		// isPresent().

	}

}