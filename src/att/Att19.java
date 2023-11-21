package att;

import java.util.Scanner;

public class Att19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		int valor1=sc.nextInt();
		System.out.println("Escreva outro numero: ");
		int valor2=sc.nextInt();
		if(valor1>valor2) {
			System.out.println(valor1+" é maior que "+valor2);
		}
		else {
			System.out.println(valor2+" é maior que "+valor1);
		}
		sc.close();

	}

}
