package br.com.dio;
import java.util.Scanner;

public class Main {

	// Formato de uma constante
	private final static String HELCOME_MESSEGE = "Olá! Informe seu nome: ";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(HELCOME_MESSEGE);
		String nome = scanner.next();
		
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		// System.out.printf("Olá %s, sua idade é %s", nome, idade);
		System.out.println("Olá "+nome+", sua idade é "+idade);
	}

}
