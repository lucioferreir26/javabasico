package cursoJava.basco;
/*
 * Entrada e saída 
 * 
 * autor: Lucio
 * data: 26/07/2022
 * 
 **/

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		//Criação de variáveis
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome.");
		
		nome = leitor.nextLine();
		
		System.out.println("Digete a sua idade.");
		
		idade = leitor.nextInt();
		
		System.out.println("Digete a sua altura.");
		
		altura = leitor.nextDouble();
		
		System.out.println("Nome:"+nome);
		System.out.println("idade:"+idade);
		System.out.println("altura:"+altura);
		
	
		System.out.println();
		
		System.out.printf("Nome: %s \nidade: %d \naltura: %.2f",nome,idade,altura);
		
		
		
		
		

	}

}
