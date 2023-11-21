package att;
import java.util.Scanner;
public class Att26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual a quantiade atual de estoque? ");
		int estoqueAtual=sc.nextInt();
		System.out.println("Qual a quantidade máxima de estoque? ");
		int estoqueMax=sc.nextInt();
		System.out.println("Qual a quantidade mínima de estoque? ");
		int estoqueMin=sc.nextInt();
		int media=((estoqueMax+estoqueMin)/2);
		if(estoqueAtual>=media) {
			System.out.println("Não efetuar compra.");
		}
		else {
			System.out.println("Efetuar compra.");
		}
		sc.close();
	}

}
