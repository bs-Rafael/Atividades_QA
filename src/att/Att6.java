package att;
import java.util.Scanner;
public class Att6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite base do retangulo: ");
		int base=sc.nextInt();
		System.out.println("Digite a altura do retangulo: ");
		int altura=sc.nextInt();
		int area=base*altura;
		System.out.println("A area do retangulo e: "+area);
		sc.close();
	}

}
