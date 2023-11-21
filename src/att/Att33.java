package att;
import java.util.Scanner;
public class Att33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite primeiro valor: ");
		int valor1=sc.nextInt();
		System.out.println("Digite segundo valor: ");
		int valor2=sc.nextInt();
		if(valor1==valor2) {
			System.out.println("Os valores são iguais.");
		}
		else if(valor1>valor2) {
			System.out.println(valor1+" é maior");
		}
		else {
			System.out.println(valor2+" é maior");
		}
		sc.close();

	}

}
