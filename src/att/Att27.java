package att;
import java.util.Scanner;
public class Att27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor=sc.nextInt();
		if(valor>0) {
			System.out.println("O valor é positivo.");
		}
		else if(valor==0) {
			System.out.println("O valor é zero.");
		}
		else {
			System.out.println("O valor é negativo.");
		}
		sc.close();

	}

}
