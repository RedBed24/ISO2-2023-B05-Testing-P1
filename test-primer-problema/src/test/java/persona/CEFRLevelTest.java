package persona;

import static org.junit.jupiter.api.Assertions.*;

public class CEFRLevelTest {

	public void testFromString() {
		assertEquals(CEFRLevel.A1, CEFRLevel.fromString("A1"));
		assertEquals(CEFRLevel.A2, CEFRLevel.fromString("A2"));
		assertEquals(CEFRLevel.B1, CEFRLevel.fromString("B1"));
		assertEquals(CEFRLevel.B2, CEFRLevel.fromString("B2"));
		assertEquals(CEFRLevel.C1, CEFRLevel.fromString("C1"));
		assertEquals(CEFRLevel.C2, CEFRLevel.fromString("C2"));
	}

	public void testInvalidFromString() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> { CEFRLevel.fromString("invalido"); } );
	}

}
