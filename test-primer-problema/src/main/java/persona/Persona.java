package persona;

import java.time.LocalDate;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected LocalDate fecha_nacimiento;
	protected Nacionalidad nacionalidad;
	protected TitulacionEducativa titulacion;
	protected CEFRLevel certificacion_ingles;
	protected int num_telefono;
	protected String correo_electronico;

	/**
	 * Constructor de la clase Persona, crea una persona con un estado válido
	 * @param nombre
	 * @param apellidos
	 * @param fecha_nacimiento La fecha de nacimiento no puede ser posterior a la fecha actual
	 * @param nacionalidad
	 * @param titulacion
	 * @param certificacion_ingles
	 * @param num_telefono
	 * @param correo_electronico
	 */
	public Persona(String nombre, String apellidos, LocalDate fecha_nacimiento, Nacionalidad nacionalidad, TitulacionEducativa titulacion, CEFRLevel certificacion_ingles, int num_telefono, String correo_electronico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setFechaNacimiento(fecha_nacimiento);
		this.nacionalidad = nacionalidad;
		this.titulacion = titulacion;
		this.certificacion_ingles = certificacion_ingles;
		this.num_telefono = num_telefono;
		this.correo_electronico = correo_electronico;
	}

	private void setFechaNacimiento(LocalDate fecha_nacimiento) {
		if (fecha_nacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual");
		}
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fecha_nacimiento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public TitulacionEducativa getTitulacion() {
		return titulacion;
	}
}
