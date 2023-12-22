package test.iso.b05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import user.cli.Input;

public class CreadorInteractivoGestorPersonasTest {
	@Test
	public void testCrearGestorPersonas() {
		// edad invalida, edad valida, numero de nacionalidades, nacionalidad invalida, nacionalidad valida, numero de titulaciones, titulacion invalida, titulacion valida
		String entrada = "-1\n1\n1\nnacionalidad invalida\nespanol\n1\ntitulacion invalida\ndoctorado\n";

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			Scanner salida_errores = new Scanner(f);

			CreadorInteractivoGestorPersonas.crearGestorPersonas(input);

			salida_errores.close();
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

}

