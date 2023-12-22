package persona;

import java.util.List;
import java.time.Period;
import java.time.LocalDate;

public class GestorPersonas {
	private Period mayoriaEdad;
	private List<Nacionalidad> nacionalidadesEuropeas;
	private List<TitulacionEducativa> titulacionesDoctorado;

	public GestorPersonas(Period mayoriaEdad, List<Nacionalidad> nacionalidadesEuropeas, List<TitulacionEducativa> titulacionesDoctorado) {
		setMayoriaEdad(mayoriaEdad);
		this.nacionalidadesEuropeas = nacionalidadesEuropeas;
		this.titulacionesDoctorado = titulacionesDoctorado;
	}

	private void setMayoriaEdad(Period mayoriaEdad) {
		if (mayoriaEdad.isNegative()) {
			throw new IllegalArgumentException("La mayoria de edad no puede ser negativa");
		}
		this.mayoriaEdad = mayoriaEdad;
	}

	public boolean esMayorEdad(LocalDate fechaNaciemiento) {
		Period edad = Period.between(fechaNaciemiento, LocalDate.now());
		return !edad.minus(mayoriaEdad).isNegative();
	}

	public boolean esEuropea(Nacionalidad nacionalidad) {
		return nacionalidadesEuropeas.contains(nacionalidad);
	}

	public boolean puedeMatricularseDoctorado(TitulacionEducativa titulacion) {
		return titulacionesDoctorado.contains(titulacion);
	}
}
