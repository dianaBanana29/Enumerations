package telran.measure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.measure.WeightUnit;

class WeigtUnitTest {

	@Test
	void convertTest() {
		assertEquals(10000f, WeightUnit.KG.convertValue(WeightUnit.GR, 10));
	}

}
