package com.aula3;

public class Switch {

	public static void main(String[] args) {
		String cargo = "Professor Fundamental 2";
		
		switch(cargo) {
		
		case "Professor Infantil 1":
			System.out.println("R$ 4000");
			break;
		
		case "Professor Infantil 2":
			System.out.println("R$ 5700");
			break;
			
		case "Professor Fundamental 1":
			System.out.println("R$ 6000");
			break;
			
		case "Professor Fundamental 2":
			System.out.println("R$ 7000");	
			break;
			
		case "Professor Ensino Médio ":
			System.out.println("R$ 8000");
			break;
			
			default:
				System.out.println("Valor Invalido");
				break;
			
		}
		
	}

}
