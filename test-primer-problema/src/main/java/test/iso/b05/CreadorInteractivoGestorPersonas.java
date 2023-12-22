package test.iso.b05;

import user.cli.Input;
import java.util.List;
import java.util.ArrayList;
import java.time.Period;
import persona.*;

public class CreadorInteractivoGestorPersonas {
	public static Period obtenerMayoriaEdad(Input in) {
		Period mayoria_edad;
		do {
			System.out.println("Introduzca la mayoria de edad en años:");
			mayoria_edad = Period.ofYears(in.getInt());
			if (mayoria_edad.isNegative()) {
				System.out.println("Se debe introducir un número de años positivo");
			}
		} while (mayoria_edad.isNegative());

		return mayoria_edad;
	}

	public static List<Nacionalidad> obtenerNacionalidadesEuropeas(Input in) {
		// FIXME: quizá mejor usar un Set
		// FIXME: quizá mejor listar las posibles nacionalidades
		List<Nacionalidad> nacionalidades_europeas = new ArrayList<Nacionalidad>();
		System.out.println("¿Cuántas nacionalidades europeas desea introducir?:");
		int num_nacionalidades = in.getInt();
		for (int i = 0; i < num_nacionalidades; i++) {
			try {
				System.out.println("Introduzca la nacionalidad:");
				nacionalidades_europeas.add(Nacionalidad.fromString(in.getString()));
			} catch (IllegalArgumentException e) {
				System.out.println("La nacionalidad introducida no es válida");
				i--;
			}
		}

		return nacionalidades_europeas;
	}

	public static List<TitulacionEducativa> obtenerTitulacionesDoctorado(Input in) {
		// FIXME: lo mismo que en obtenerNacionalidadesEuropeas
		List<TitulacionEducativa> titulaciones_doctorado = new ArrayList<TitulacionEducativa>();
		System.out.println("¿Cuántas titulaciones que te permiten matricular en doctorado desea introducir?:");
		int num_titulaciones = in.getInt();
		for (int i = 0; i < num_titulaciones; i++) {
			try {
				System.out.println("Introduzca la titulación:");
				titulaciones_doctorado.add(TitulacionEducativa.fromString(in.getString()));
			} catch (IllegalArgumentException e) {
				System.out.println("La titulación introducida no es válida");
				i--;
			}
		}

		return titulaciones_doctorado;
	}

	public static GestorPersonas crearGestorPersonas(Input in) {
		Period mayoria_edad = obtenerMayoriaEdad(in);
		List<Nacionalidad> nacionalidades_europeas = obtenerNacionalidadesEuropeas(in);
		List<TitulacionEducativa> titulaciones_doctorado = obtenerTitulacionesDoctorado(in);

		return new GestorPersonas(mayoria_edad, nacionalidades_europeas, titulaciones_doctorado);
	}
}
