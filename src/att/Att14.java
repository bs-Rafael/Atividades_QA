package att;

import java.util.Scanner;

public class Att14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		if (numero > 10) {
			System.out.println("É maior que 10!");
		} else {
			System.out.println("Não é maior que 10!");
		}
		sc.close();

	}

}
