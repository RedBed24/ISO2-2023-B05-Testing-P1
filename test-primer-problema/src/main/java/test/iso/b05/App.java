package test.iso.b05;

import user.cli.Input;

import java.util.List;
import java.util.Arrays;
import java.io.PrintStream;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

import persona.*;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		Input in = new Input(new Scanner(System.in), new PrintStream(System.out));

		Period mayoria_edad;
		do {
			System.out.println("Introduzca la mayoria de edad en años:");
			mayoria_edad = Period.ofYears(in.getInt());
			if (mayoria_edad.isNegative()) {
				System.out.println("Se debe introducir un número de años positivo");
			}
		} while (mayoria_edad.isNegative());

		List<Nacionalidad> nacionalidades_europeas = Arrays.asList(
			Nacionalidad.PORTUGUES,
			Nacionalidad.ESPANOL,
			Nacionalidad.FRANCES,
			Nacionalidad.ITALIANO
		);

		List<TitulacionEducativa> titulaciones_doctorado = Arrays.asList(
			TitulacionEducativa.DOCTORADO,
			TitulacionEducativa.MASTER
		);

		GestorPersonas gp = new GestorPersonas(mayoria_edad, nacionalidades_europeas, titulaciones_doctorado);

		Persona p1 = new Persona("Samuel", "Espejo Gil", LocalDate.of(2003, 6, 2), Nacionalidad.ESPANOL, TitulacionEducativa.ESO, CEFRLevel.B1, 622668849, "samuel.espejo@alu.uclm.es");
		Persona p2 = new Persona(
			in.getString(),
			in.getString(),
			in.getDate(),
			Nacionalidad.fromString(in.getString()),
			TitulacionEducativa.fromString(in.getString()),
			CEFRLevel.fromString(in.getString()),
			in.getPhoneNumber(),
			in.getMail()
		);

		gp.esEuropea(p1.getNacionalidad());
		gp.esMayorEdad(p2.getFechaNacimiento());
	}
}
