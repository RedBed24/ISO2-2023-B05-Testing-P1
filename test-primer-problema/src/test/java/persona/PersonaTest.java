package persona;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PersonaTest {
    
    public void testSetFechaNacimiento() {
    	LocalDate fecha = LocalDate.now().minusYears(25);
        Persona persona = new Persona("Samuel", "Espejo", fecha, Nacionalidad.ESPANOL, TitulacionEducativa.CARRERA, CEFRLevel.B2, 123456789, "samuel@alu.uclm.es");        
        assertEquals(fecha, persona.getFechaNacimiento());
    }

    public void testInvalidSetFechaNacimiento() {
    	LocalDate fecha = LocalDate.now().plusYears(25);    
		assertThrows(IllegalArgumentException.class, () -> { new Persona("Samuel", "Espejo", fecha, Nacionalidad.ESPANOL, TitulacionEducativa.CARRERA, CEFRLevel.B2, 123456789, "samuel@alu.uclm.es"); } );
    }
}
