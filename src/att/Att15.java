package att;

import java.util.Scanner;

public class Att15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero=sc.nextInt();
		if(numero%2==0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}sc.close();

	}

}
