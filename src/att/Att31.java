package att;
import java.util.Scanner;
public class Att31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor de A ");
		int valorA=sc.nextInt();
		System.out.println("Digite o valor de B ");
		int valorB=sc.nextInt();
		System.out.println("Digite o valor de C");
		int valorC=sc.nextInt();
		if(valorA<valorB+valorC) {
			if(valorB<valorA+valorC) {
				if(valorC<valorA+valorB) {
					System.out.println("Os valores formam um triângulo.");
				}
			}
		}
		else {
			System.out.println("Os valores não formam um triângulo.");
		}
		sc.close();

	}

}
