package desafio;

import java.util.Scanner;

public class Senhas {

	public static void main(String[] args) {
		
		Scanner Vscanner1 = new Scanner(System.in);
		
		System.out.println("Digite sua senha ");
		
		String senha1 = Vscanner1.nextLine();
		
		Scanner Vscanner2 = new Scanner(System.in);
	
		System.out.println("Digite a senha novamente" );
		String senha2 = Vscanner2.nextLine();
	
	
		if (senha1.equals(senha2) ) {
			
			System.out.println("Senha correnta" );
			
		}else {
			
			System.out.println("Senhas não estão iguais");
		}
		
		
	}

}
