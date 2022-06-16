package tasca4n1ex2;

public class Dni {

	final static String LETRAS_COINCIDENTES[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J",
			"Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

	public static String CalculoDni(String dni) {
		int nums;
		nums = Integer.parseInt(dni);
		nums %= 23;
		return LETRAS_COINCIDENTES[nums];
	}

}
