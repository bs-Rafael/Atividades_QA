package att;
import java.util.Scanner;
public class Att29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1=sc.nextInt();
		System.out.println("Digite um segundo valor: ");
		int valor2=sc.nextInt();
		System.out.println("Digite um terceiro valor: ");
		int valor3=sc.nextInt();
		if(valor1<=valor2&&valor1<=valor3) {
			int soma=valor2+valor3;
			System.out.println("A soma de "+valor2+" + "+valor3+" é "+soma);
		}
		else if(valor2<=valor1&&valor1<=valor3) {
			int soma=valor1+valor3;
			System.out.println("A soma de "+valor1+" + "+valor3+" é "+soma);
		}
		else {
			int soma=valor1+valor2;
			System.out.println("A soma de "+valor1+" + "+valor2+" é "+soma);
		}
		
		
		sc.close();

	}

}
