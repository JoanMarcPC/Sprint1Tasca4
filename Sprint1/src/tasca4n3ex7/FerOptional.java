package tasca4n3ex7;

import java.util.Optional;

public class FerOptional {

	public static Optional<String> busquedaQuePuedeDarNull(boolean OptionalLleno) {

		if (OptionalLleno) {
			return Optional.of("Hola");
		} else {
			return Optional.empty();
		}

	}
}
