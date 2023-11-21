package att;
import java.util.Scanner;
public class Att28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1=sc.nextInt();
		System.out.println("Digite um segundo valor: ");
		int valor2=sc.nextInt();
		System.out.println("Digite um terceiro valor: ");
		int valor3=sc.nextInt();
		if(valor1>valor2&&valor1>valor2) {
			System.out.println(valor1+" é o maior.");
		}
		else if(valor2>valor1&&valor2>valor3) {
			System.out.println(valor2+" é o maior.");
		}
		else {
			System.out.println(valor3+" é o maior.");
		}
		sc.close();

	}

}
