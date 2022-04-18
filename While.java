import java.util.Scanner;
import java.util.Random;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(10);
		int numeroEntrada;
		int tentativas = 1;

		System.out.print("Digite um n�mero de 0 a 10: ");

		numeroEntrada = scanner.nextInt();

		while (numeroEntrada != numeroAleatorio) {
			if (numeroEntrada > numeroAleatorio) {
				System.out.print("Errou. Tente um n�mero menor. ");
				numeroEntrada = scanner.nextInt();
				tentativas++;
				}else if (numeroEntrada < numeroAleatorio) {
				System.out.print("Errou. Tente um n�mero maior. ");
				numeroEntrada = scanner.nextInt();
				tentativas++;
				}
			}
		if (numeroEntrada == numeroAleatorio) {
			System.out.println("Parab�ns, voc� acertou! O n�mero correto era o numero: " + numeroAleatorio
					+ ".\nVoc� preciso de " + tentativas + " tentativas para acertar!.");
			}
		}
	}
	

