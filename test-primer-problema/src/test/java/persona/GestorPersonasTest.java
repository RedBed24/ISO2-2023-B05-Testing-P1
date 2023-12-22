package persona;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Period;

import java.util.List;
import java.util.Arrays;

public class GestorPersonasTest {

	public void testGestorPersonasValidio() {
		GestorPersonas gestor = new GestorPersonas(Period.ofYears(8), null, null);
		assertNotNull(gestor);
	}

	public void testGestorPersonasInvalido() {
		assertThrows(IllegalArgumentException.class, () -> { new GestorPersonas(Period.ofYears(-4), null, null); });
	}

	public void testEsMayorEdad() {
		GestorPersonas gestor = new GestorPersonas(Period.ofYears(18), null, null);
		assertTrue(gestor.esMayorEdad(LocalDate.of(2000, 1, 1)));
		assertFalse(gestor.esMayorEdad(LocalDate.of(2010, 1, 1)));
	}

	public void testEsEuropea() {
		List<Nacionalidad> nacionalidades_europeas = Arrays.asList(
			Nacionalidad.PORTUGUES,
			Nacionalidad.ESPANOL,
			Nacionalidad.FRANCES,
			Nacionalidad.ITALIANO
		);

		GestorPersonas gestor = new GestorPersonas(Period.ofYears(18), nacionalidades_europeas, null);
		assertTrue(gestor.esEuropea(Nacionalidad.ESPANOL));
		assertFalse(gestor.esEuropea(Nacionalidad.JAPONES));
	}

	public void testPuedeMatricularseDoctorado() {
		List<TitulacionEducativa> titulaciones_doctorado = Arrays.asList(
			TitulacionEducativa.DOCTORADO,
			TitulacionEducativa.MASTER
		);

		GestorPersonas gestor = new GestorPersonas(Period.ofYears(18), null, titulaciones_doctorado);
		assertTrue(gestor.puedeMatricularseDoctorado(TitulacionEducativa.DOCTORADO));
		assertFalse(gestor.puedeMatricularseDoctorado(TitulacionEducativa.ESO));
	}

}
