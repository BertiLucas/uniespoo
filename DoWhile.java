import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;
		int quantidadeDeNumerosLidos = 0;
		int soma = 0;
		int quantidadeDeNumerosPositivos = 0;
		int quantidadeDeNumerosNegativos = 0;

		do {

			System.out.print("Informe um número inteiro (Digite 0 para sair): ");
			numero = Integer.parseInt(scanner.nextLine());
			if (numero > 0) {
				quantidadeDeNumerosPositivos++;
			}else if (numero < 0) {
				quantidadeDeNumerosNegativos++;
				}
			
			soma += numero;
			
			if (numero != 0) {
				quantidadeDeNumerosLidos++;
				}
			}
		
		while (numero != 0);
		if (quantidadeDeNumerosLidos == 0) {
			System.out.println("Você não informou nenhum número.");
		}else{
			System.out.println("A quantidade de números positivos é: " + quantidadeDeNumerosPositivos);
			System.out.println("A quantidade de números negativos é: " + quantidadeDeNumerosNegativos);
			System.out.println("A soma dos números lidos é: " + soma);
			System.out.println("A média aritmética dos números lidos é: " + ((soma * 1.0) / quantidadeDeNumerosLidos));
			
		}
	}

}
