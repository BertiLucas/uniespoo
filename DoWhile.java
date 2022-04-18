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

			System.out.print("Informe um n�mero inteiro (Digite 0 para sair): ");
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
			System.out.println("Voc� n�o informou nenhum n�mero.");
		}else{
			System.out.println("A quantidade de n�meros positivos �: " + quantidadeDeNumerosPositivos);
			System.out.println("A quantidade de n�meros negativos �: " + quantidadeDeNumerosNegativos);
			System.out.println("A soma dos n�meros lidos �: " + soma);
			System.out.println("A m�dia aritm�tica dos n�meros lidos �: " + ((soma * 1.0) / quantidadeDeNumerosLidos));
			
		}
	}

}
