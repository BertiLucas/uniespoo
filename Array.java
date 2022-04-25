/*Desenvolva um algoritmo que permita ao usu�rio informar 10 n�meros inteiros, 
  onde esses n�meros ser�o armazenados em uma lista. 
  Em seguida preciso que seja exibido em tela as seguintes informa��es:
  Exiba o menor valor dos 10 n�meros informados;
  Exiba o maior valor dos 10 n�meros informados;
  A soma de todos os n�meros;
  A soma de todos os n�meros pares;

	Dicas: Utilize a maioria dos assuntos j� abordados em sala de aula (if,else, for, arrays, opera��es,...)*/

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
			System.out.print("Digite o " + (x + 1) + "� n�mero: ");
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
		
		System.out.println("O maior n�mero �: " + maiorNumero);
		System.out.println("O menor n�mero �: " + menorNumero);
		System.out.println("A soma de todos os n�meros �: " + somaDeTodosOsNumeros);
		System.out.println("A soma dos n�meros pares �: " + somaDosNumerosPares);
	}

}
