package test.iso.b05;

import user.cli.Input;

import java.io.PrintStream;
import java.util.Scanner;

import persona.*;

public class App
{
	public static void main(String[] args)
	{
		Input in = new Input(new Scanner(System.in), new PrintStream(System.out));
		boolean salir = false;
		GestorPersonas gp = CreadorInteractivoGestorPersonas.crearGestorPersonas(in);
		Persona p = null;
		do {
			System.out.printf("1. Comprobar persona\n2. Cambiar gestor de personas\n3. Salir\nOpción: ");
			switch (in.getInt()) {
				case 1:
					p = CreadorInteractivoPersonas.crearPersona(in);
					System.out.println((gp.esEuropea(p.getNacionalidad()) ? "Es" : "No es") + " europea");
					System.out.println((gp.esMayorEdad(p.getFechaNacimiento()) ? "Es" : "No es") + " mayor de edad");
					System.out.println((gp.puedeMatricularseDoctorado(p.getTitulacion()) ? "Puede" : "No puede") + " matricularse en doctorado");
					break;
				case 2:
					gp = CreadorInteractivoGestorPersonas.crearGestorPersonas(in);
					break;
				case 3:
					salir = true;
					break;
				default:
					System.out.println("Opción no válida");
			}
		} while (!salir);
	}
}
