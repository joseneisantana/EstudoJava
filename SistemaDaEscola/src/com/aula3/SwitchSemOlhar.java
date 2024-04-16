package com.aula3;

import java.util.Scanner;



public class SwitchSemOlhar {

	
	
	public static void main(String[] args) {
		
		Scanner variavelScanner = new Scanner (System.in);
		System.out.println("Digite um valor");
		String variavelString = variavelScanner.nextLine();
		
		
	String dinheiro ;
		
		switch("dinheiro"){
			
		case "100":
			System.out.println("50 de troco");
			break;
			
		case"500":
			System.out.println("100 de troco");
			break;
			
		case "900":
			System.out.println("Nao tem troco");
				break;
				
			default:
				System.out.println("Não é sua mãe que esta aqui ");
				break;
			
				
				
			
		}
		

	}

}
