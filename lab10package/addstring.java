package lab10package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addstring {

	@Test
	void test() {
		lab10fuctions junitString = new lab10fuctions();
		String result = junitString.addString("hi", "kaiseho");
		assertEquals("hikaiseho",result);
	}

}
