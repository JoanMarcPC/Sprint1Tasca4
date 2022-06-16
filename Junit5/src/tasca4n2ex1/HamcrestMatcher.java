package tasca4n2ex1;




import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

 class HamcrestMatcher {

	
	
	
	public static Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "lenght") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
	}

	@Test
	public void TestString () {
		
		System.out.println("hola");
		
		assertThat("Mordor",length(is(8))); // faig que falli
	}


	
	



	



	

}
