/*Desenvolva um algoritmo que permita ao usuário informar 10 números inteiros, 
  onde esses números serão armazenados em uma lista. 
  Em seguida preciso que seja exibido em tela as seguintes informações:
  Exiba o menor valor dos 10 números informados;
  Exiba o maior valor dos 10 números informados;
  A soma de todos os números;
  A soma de todos os números pares;

	Dicas: Utilize a maioria dos assuntos já abordados em sala de aula (if,else, for, arrays, operações,...)*/

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maiorNumero= 0;
		int menorNumero = 0;
		int somaDeTodosOsNumeros = 0;
		int somaDosNumerosPares = 0;

		int[] numeros = new int[10];

		for (int x = 0; x < numeros.length; x++) {
			System.out.print("Digite o " + (x + 1) + "º número: ");
			numeros[x] = scanner.nextInt();

			if (x == 0) {
				maiorNumero = numeros[x];
				menorNumero = numeros[x];
			}
			if (numeros[x] < menorNumero) {
				menorNumero = numeros[x];
			} else if (numeros[x] > maiorNumero) {
				maiorNumero = numeros[x];
			}

			somaDeTodosOsNumeros += numeros[x];

			if (numeros[x] % 2 == 0) {
				somaDosNumerosPares += numeros[x];
			}

		}
		
		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("O menor número é: " + menorNumero);
		System.out.println("A soma de todos os números é: " + somaDeTodosOsNumeros);
		System.out.println("A soma dos números pares é: " + somaDosNumerosPares);
	}

}
