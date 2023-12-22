package persona;
import static org.junit.jupiter.api.Assertions.*;

public class TitulacionTest {

	public void testFromString() {
		assertEquals(TitulacionEducativa.ESO, TitulacionEducativa.fromString("ESO"));
		assertEquals(TitulacionEducativa.BACHILLERATO, TitulacionEducativa.fromString("BACHILLERATO"));
		assertEquals(TitulacionEducativa.FP, TitulacionEducativa.fromString("FP"));
		assertEquals(TitulacionEducativa.GRADO_MEDIO, TitulacionEducativa.fromString("GRADO_MEDIO"));
		assertEquals(TitulacionEducativa.GRADO_SUPERIOR, TitulacionEducativa.fromString("GRADO_SUPERIOR"));
		assertEquals(TitulacionEducativa.CARRERA, TitulacionEducativa.fromString("CARRERA"));
		assertEquals(TitulacionEducativa.MASTER, TitulacionEducativa.fromString("MASTER"));
		assertEquals(TitulacionEducativa.DOCTORADO, TitulacionEducativa.fromString("DOCTORADO"));
	}
	
	public void testInvalidFromString() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> { TitulacionEducativa.fromString("invalido"); } );
	}
}
