package loop01;

import java.util.Scanner;

public class NovoLoop {

	public static void main(String[] args) {
		
		
		Scanner Scanner = new Scanner(System.in);
		
		double somadorNotas = 0;  //Variavel que vai guardar as notas digotadas  
		
		for(int i = 0; i < 4 ; i++) {
			
			System.out.println("Insira a nota:");
			double nota = Scanner.nextDouble();
			somadorNotas += nota;
			
		}
		
		double media = somadorNotas /4;
		
		System.out.println("Media" + media);
		

	}

}
