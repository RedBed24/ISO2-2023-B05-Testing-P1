package test.iso.b05;

import user.cli.Input;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		Input in = new Input(new Scanner(System.in), new PrintStream(System.out));
		System.out.println(in.getInt());
	}
}
