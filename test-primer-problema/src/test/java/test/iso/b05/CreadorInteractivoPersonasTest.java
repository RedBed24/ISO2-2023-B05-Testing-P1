package test.iso.b05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import user.cli.Input;

public class CreadorInteractivoPersonasTest {
	@Test
	public void testCrearPersona() {
		// nombre, apellidos, fechaNacimiento, nacionalidad invalida, nacionalidad valida, titulacion invalida, titulacion valida, nivel invalido, nivel valido, dni invalido, numero valido, correo valido
		String entrada = "Pepito\nFlores\n01/01/2000\nnacionalidad inválida\nespanol\ntitulacion invalida\ndoctorado\nnivel invalido\nC1\n123456789\ncorreo@electronico.com\n";

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			Scanner salida_errores = new Scanner(f);

			CreadorInteractivoPersonas.crearPersona(input);

			salida_errores.close();
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

}
