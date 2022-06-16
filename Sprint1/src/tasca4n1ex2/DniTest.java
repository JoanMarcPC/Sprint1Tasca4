package tasca4n1ex2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class DniTest {

	private String dni;
	private String letra;

	@Parameters
	public static Iterable<Object[]> getData() {

		return Arrays.asList(new Object[][] { { "83221285", "V" }, { "07489694", "C" }, { "76693469", "S" },
				{ "10922615", "F" }, { "41425386", "V" }, { "14622914", "C" }, { "45275328", "N" }, { "52996191", "M" },
				{ "31809653", "D" }, { "56107829", "L" } });

		// si no ho fés així

		/*
		 * List<Object[]> obj = new ArrayList<>(); obj.add(new Object[]
		 * {"83221285","V"}); obj.add(new Object[] {"07489694","C"}); obj.add(new
		 * Object[] {"76693469","S"}); obj.add(new Object[] {"10922615","F"});
		 * obj.add(new Object[] {"41425386","V"}); obj.add(new Object[]
		 * {"14622914","C"}); obj.add(new Object[] {"45275328","N"}); obj.add(new
		 * Object[] {"52996191","M"}); obj.add(new Object[] {"31809653","D"});
		 * obj.add(new Object[] {"56107829","L"}); return obj;
		 */

	}

	public DniTest(String dni, String letra) {
		this.dni = dni;
		this.letra = letra;
	}

	@Test
	public void testCalculoDni() {

		assertEquals(this.letra, Dni.CalculoDni(this.dni));
		;

	}

}
