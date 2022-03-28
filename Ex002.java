/*Faça um programa que leia as seguintes informações:
	Nome completo;
	Nome do curso;
	Número do período (Exemplo: 1,2,3,4…)
	Valor da primeira Nota;
	Valor da segunda Nota;
	Quantidade de faltas.
	Esse problema deve imprimir todas as informações;
	Esse problema deve imprimir a média entre as notas;
	*/

import java.util.Scanner;

public class Ex002 {
	
	
	public static void main(String[] args) {
						
		Scanner scanner = new Scanner(System.in);
		
		String nome , curso;
		int periodo , quantidadeDeFaltas;
		double primeiraNota , segundaNota;
								
		System.out.print("Digite o nome completo: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite o nome do curso: ");
		curso = scanner.nextLine();
		
		System.out.print("Digite o número do período: ");
		periodo = scanner.nextInt();
		
		System.out.print("Digite a primeira nota: ");
		primeiraNota = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		segundaNota = scanner.nextDouble();
		
		double media = (primeiraNota + segundaNota) /2;
		System.out.println("A média das notas é: " + media);
		
		System.out.print("Digite a quantidade de faltas: ");
		quantidadeDeFaltas = scanner.nextInt();
	
	}
	
	
}
