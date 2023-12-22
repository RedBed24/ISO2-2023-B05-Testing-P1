package persona;

import static org.junit.jupiter.api.Assertions.*;


public class NacionalidadTest {

	public void testFromString() {
		assertEquals(Nacionalidad.PORTUGUES, Nacionalidad.fromString("portugues"));
		assertEquals(Nacionalidad.ESPANOL, Nacionalidad.fromString("espanol"));
		assertEquals(Nacionalidad.FRANCES, Nacionalidad.fromString("frances"));
		assertEquals(Nacionalidad.ITALIANO, Nacionalidad.fromString("italiano"));
		assertEquals(Nacionalidad.JAPONES, Nacionalidad.fromString("japones"));
		assertEquals(Nacionalidad.CHINO, Nacionalidad.fromString("chino"));
		assertEquals(Nacionalidad.RUSO, Nacionalidad.fromString("ruso"));
		assertEquals(Nacionalidad.COREANO, Nacionalidad.fromString("coreano"));
		assertEquals(Nacionalidad.INDU, Nacionalidad.fromString("indu"));
	}

	
	public void testInvalidFromString() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> { Nacionalidad.fromString("invalido"); } );
	}
}

