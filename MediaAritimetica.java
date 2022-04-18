import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        double nota1, nota2;
	        double media;
	        double recuperacao;
	        double provaFinal;

	        System.out.print("Digite a Primeira Nota: ");
	        nota1 = scanner.nextDouble();
	        System.out.print("Digite a Segunda Nota: ");
	        nota2= scanner.nextDouble();
	        
	        media = (nota1 + nota2) / 2;
	        System.out.println("A media do aluno é: " + media);

	        recuperacao = 10 - media + 2;
	        provaFinal = 10 + media;

	        if( (media >= 0) && (media <= 4.9) ){
	            System.out.println("Aluno em RECUPERACAO");
	            System.out.println("O aluno precisa de " + recuperacao + " para ser Aprovado!");
	        } else if( (media >= 5 ) && (media <= 6.9) ) {
	            System.out.println("O aluno vai fazer PROVA FINAL");
	            System.out.println("O aluno precisa de " + provaFinal + " para ser Aprovado!");
	        } else {
	            System.out.println("Aluno APROVADO POR MEDIA!");
	        }
	        
	}
	
}
