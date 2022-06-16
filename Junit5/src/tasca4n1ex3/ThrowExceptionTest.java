package tasca4n1ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThrowExceptionTest {

	@Test
	void testThrowException() {
		


 assertThrows(IndexOutOfBoundsException.class, () -> {
	ThrowException.throwException();
});

}
}
