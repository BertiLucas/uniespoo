/*Fa�a um programa que leia as seguintes informa��es:
	Nome completo;
	Nome do curso;
	N�mero do per�odo (Exemplo: 1,2,3,4�)
	Valor da primeira Nota;
	Valor da segunda Nota;
	Quantidade de faltas.
	Esse problema deve imprimir todas as informa��es;
	Esse problema deve imprimir a m�dia entre as notas;
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
		
		System.out.print("Digite o n�mero do per�odo: ");
		periodo = scanner.nextInt();
		
		System.out.print("Digite a primeira nota: ");
		primeiraNota = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		segundaNota = scanner.nextDouble();
		
		double media = (primeiraNota + segundaNota) /2;
		System.out.println("A m�dia das notas �: " + media);
		
		System.out.print("Digite a quantidade de faltas: ");
		quantidadeDeFaltas = scanner.nextInt();
	
	}
	
	
}
