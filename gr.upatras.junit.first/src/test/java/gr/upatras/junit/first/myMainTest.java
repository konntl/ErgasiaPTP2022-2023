package gr.upatras.junit.first;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class subtractpnTest {
	@Test
	void testSubtractpn() {
		subtractpn tester = new subtractpn();
		assertEquals("POSITIVE", tester.subtractResult(10, 5), "10 - 5 = 5 > 0, should return POSITIVE");
		assertEquals("NEGATIVE", tester.subtractResult(5,10),"5 - 10 = -5 < 0, should return NEGATIVE");
		assertEquals("ZERO", tester.subtractResult(5,5),"5 - 5 = 0 , neither positive or negative, should return ZERO");
	}
}