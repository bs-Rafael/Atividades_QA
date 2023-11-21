package att;
import java.util.Scanner;
public class Att17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual a nota da primeira avaliação do aluno? ");
		int n1=sc.nextInt();
		System.out.println("Qual a nota da segunda avaliação do aluno? ");
		int n2=sc.nextInt();
		double media=(n1+n2)/2;
		if(media>=6) {
			System.out.println("O aluno foi aprovado");
		}
		else {
			System.out.println("O aluno foi reprovado");
		}
		sc.close();

	}

}
