package tasca4n3ex5;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class N3ex5MapAssertions {
	private HashMap<String, String> map;
	private String key;

	public N3ex5MapAssertions(HashMap<String, String> map, String key) {
		this.map = map;
		this.key = key;

	}

	@Parameters
	public static Iterable<Object[]> getData() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1234", "lala");
		map.put("4567", "lala");
		map.put("8910", "lala");
		map.put("2314", "lala");
		map.put("7852", "lala");
		map.put("4515", "lala");
		map.put("1237", "lala");

		return Arrays.asList(new Object[][] { { map } });

	}

	@Test
	public void testMap() {

		assertThat(map).containsKey(key);

	}

}