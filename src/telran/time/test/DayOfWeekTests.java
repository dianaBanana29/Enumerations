package telran.time.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import telran.times.DayOfWeek;

public class DayOfWeekTests {
	private static final String YOM_RISHON = "יום רישון";
	private static final String YOM_SHABBAT = "שבת";
	private static final String OTHER_YOM = "other";
String getHebrewDayOfWeek(DayOfWeek weekDay) {
	switch(weekDay) {
	case SUN: return YOM_RISHON;
	case SAT: return YOM_SHABBAT;
	default: return OTHER_YOM;
	}
}
	@Test
	void hebrewDayTest() {
		assertEquals(YOM_RISHON, getHebrewDayOfWeek(DayOfWeek.SUN));
		assertEquals(YOM_SHABBAT, getHebrewDayOfWeek(DayOfWeek.SAT));
	}
	@Test
	void toStirngTest() {
		assertEquals("FRI", DayOfWeek.FRI.toString());
	}
	@Test
	void valueOfTest() {
		assertEquals(DayOfWeek.SAT, DayOfWeek.valueOf("SAT"));
	}
	@Test
	void compareToTest() {
		assertTrue(DayOfWeek.SAT.compareTo(DayOfWeek.SUN)> 0);
	}
@Test
void plusDaysTest() {
	assertEquals(DayOfWeek.SAT, DayOfWeek.THU.plusDays(2));
	assertEquals(DayOfWeek.THU, DayOfWeek.THU.plusDays(7));
	assertEquals(DayOfWeek.SAT, DayOfWeek.THU.plusDays(1003));
}
@Test
void beetwenTest() {
	assertEquals(2, DayOfWeek.between(DayOfWeek.THU, DayOfWeek.SAT));
	assertEquals(6, DayOfWeek.between(DayOfWeek.THU, DayOfWeek.WED));
	assertEquals(7, DayOfWeek.between(DayOfWeek.SAT, DayOfWeek.SAT));
}
}
