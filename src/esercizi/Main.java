package esercizi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Definire la stringa "123 T-SHIRT 200,5" a programma ed estrarre
		 * con Scanner, verificando il tipo e stampandoli i seguenti dati:
		 * - un int
		 * - una String
		 * - un double */
		
		// Default string
		String myString = "123 T-SHIRT 200,5";
		
		// New scanner
		Scanner scanner = new Scanner(myString);
		
		if (scanner.hasNextInt()) {
			int outInt = scanner.nextInt();
			System.out.println("int: " + outInt);
		}
		
		/* Devo utilizzare hasNext() che controlla se il token successivo è di tipo string */
		if (scanner.hasNext()) {
			String outString = scanner.next();
			System.out.println("String: " + outString);
		}
		
		if (scanner.hasNextDouble()) {
			double outDouble = scanner.nextDouble();
			System.out.println("double: " + outDouble);
		}
		
		scanner.close();
		
	}

}
