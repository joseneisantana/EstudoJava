package loop01;

import java.util.Scanner;

public class lopWhile {

	public static void main(String[] args) {
	
		Scanner Scanner = new Scanner(System.in); 
		System.out.println("Insira o numero ");
		int somaValores= 0;
		
		while(somaValores == 0) {
			
			int valor =Scanner.nextInt();
			somaValores += valor;
			
			System.out.println( somaValores);
			
		}
		
		
		
		
		

	}

}
