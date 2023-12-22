package test.iso.b05;

import java.time.LocalDate;

import user.cli.Input;
import persona.*;

public class CreadorInteractivoPersonas {
	public static Nacionalidad obtenerNacionalidad(Input in) {
		Nacionalidad nacionalidad = null;
		System.out.println("Introduzca la nacionalidad:");
		do {
			try {
				nacionalidad = Nacionalidad.fromString(in.getString());
			} catch (IllegalArgumentException e) {
				System.out.println("La nacionalidad introducida no es válida");
			}
		} while (nacionalidad == null);
		return nacionalidad;
	}

	public static TitulacionEducativa obtenerTitulacion(Input in) {
		TitulacionEducativa titulacion = null;
		System.out.println("Introduzca la titulación:");
		do {
			try {
				titulacion = TitulacionEducativa.fromString(in.getString());
			} catch (IllegalArgumentException e) {
				System.out.println("La titulación introducida no es válida");
			}
		} while (titulacion == null);
		return titulacion;
	}

	public static CEFRLevel obtenerCertificacionIngles(Input in) {
		CEFRLevel certificacion_ingles = null;
		System.out.println("Introduzca la certificación de inglés:");
		do {
			try {
				certificacion_ingles = CEFRLevel.fromString(in.getString());
			} catch (IllegalArgumentException e) {
				System.out.println("La certificación de inglés introducida no es válida");
			}
		} while (certificacion_ingles == null);
		return certificacion_ingles;
	}

	public static Persona crearPersona(Input in) {
		System.out.println("Introduzca el nombre:");
		String nombre = in.getString();
		System.out.println("Introduzca los apellidos:");
		String apellidos = in.getString();
		System.out.println("Introduzca la fecha de nacimiento:");
		LocalDate fecha_nacimiento = in.getDate();

		Nacionalidad nacionalidad = obtenerNacionalidad(in);
		TitulacionEducativa titulacion = obtenerTitulacion(in);
		CEFRLevel certificacion_ingles = obtenerCertificacionIngles(in);

		System.out.println("Introduzca el número de teléfono:");
		int num_telefono = in.getPhoneNumber();
		System.out.println("Introduzca el correo electrónico:");
		String correo_electronico = in.getMail();

		return new Persona(nombre, apellidos, fecha_nacimiento, nacionalidad, titulacion, certificacion_ingles, num_telefono, correo_electronico);
	}
}
