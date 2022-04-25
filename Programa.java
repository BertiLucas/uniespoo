 /*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
  *Fazer um algoritmo que calcule e escreva:
     a maior e a menor altura do grupo;
     média de altura do sexo igual a masculino;
     o número de registros de sexo igual a feminino.*/

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		float altura;
		float somaAlturaDosHomens = 0;
		float mediaAlturaDosHomens = 0;
		float maiorAltura = 0;
		float menorAltura = 100;
		int sexo;
		int quantidadeSexoFeminino = 0;
		int quantidadeSexoMasculino = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int x= 0; x < 10; x++) {
			
			System.out.print("Digite 0 para sexo MASCULINO e 1 para sexo FEMININO: ");
			sexo = scanner.nextInt();
			
			System.out.print("Digite a altura para o ultimo sexo escolhido: ");
			altura = scanner.nextFloat();
			
			if (sexo == 0) {
				quantidadeSexoMasculino++;
				somaAlturaDosHomens = somaAlturaDosHomens + altura;
				
			} else if (sexo == 1) {
				quantidadeSexoFeminino++;
			}
								
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			mediaAlturaDosHomens = somaAlturaDosHomens / quantidadeSexoMasculino;
		}
		
		System.out.println("A maior altura digitada foi: " + maiorAltura);
		System.out.println("A menor altura digitada foi: " + menorAltura);
		System.out.println("A média de altura do sexo MASCULINO foi: " + mediaAlturaDosHomens);
		System.out.println("A quantidade de pessoas do sexo FEMININO é: " + quantidadeSexoFeminino);
		
	}

}
