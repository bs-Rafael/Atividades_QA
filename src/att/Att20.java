package att;

import java.util.Scanner;

public class Att20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		int valor1=sc.nextInt();
		System.out.println("Escreva outro numero: ");
		int valor2=sc.nextInt();
		
		if(valor1>valor2) {
			
			while(valor2<=valor1) {
				System.out.println(valor2);
				valor2++;
			}
		}
		else {
			
			while(valor1<=valor2) {
				System.out.println(valor1);
				valor1++;
			}
		}
		sc.close();
	}

}
