import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		/*
		 * String nome = "Manuel"; String sobrenome = "Ferreira"; int idade = 19; final
		 * String matricula = "787575793"; String nomeDoPai = "José"; String nomeMae =
		 * "Maria"; Boolean Temautorizacao =true;
		 * 
		 * 
		 * 
		 * idade = 21; System.out.println(nome); System.out.println(sobrenome);
		 * System.out.println(idade); System.out.println(matricula);
		 * System.out.println(nomeDoPai +" "+ sobrenome ); System.out.println(nomeMae
		 * +" "+ sobrenome ); System.out.println(Temautorizacao);
		 * 
		 * 
		 * double matematicaNota1 = 10; double matematicaNota2 = 9; double
		 * matematicaNota3 = 8; double matematicaNota4 = 7 ;
		 * 
		 * double mediaMatematica = (matematicaNota1 + matematicaNota2 + matematicaNota3
		 * + matematicaNota4) / 4;
		 * 
		 * 
		 * 
		 * if(mediaMatematica >= 7) { System.out.println("Foi aprovado"+" "+
		 * mediaMatematica);
		 * 
		 * }else if (mediaMatematica < 7 && mediaMatematica >= 5 ) {
		 * System.out.println("Recuperação"+" "+ mediaMatematica);
		 * 
		 * }else { System.out.println("Reprovado !" +" "+ mediaMatematica); }
		 */
		 
		 Scanner Scanner =new Scanner(System.in);
		 
		 
		 double  somadorNotas = 0;
		 int somadorNumeroNotas = 0;
		 
		 while(true) {
			 System.out.println("Insira a nota");
			 double nota =Scanner.nextDouble();
			 if(nota == 0) {
				 break;
			 }
			 
			 somadorNotas +=nota;
			 somadorNumeroNotas += 1;
			 
			
		 }
		
		 double media = somadorNotas / somadorNumeroNotas;
		 System.out.println(media);
	}

}