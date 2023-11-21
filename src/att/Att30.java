
//incompleto

package att;

import java.util.Scanner;

public class Att30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor3 = sc.nextInt();
		if (valor1 >= valor2 && valor1 >= valor3) {
			int maior = valor1;
			System.out.println("valor1 é maior: " + valor1);
			if (valor2 >= valor3) {
				int medio = valor2;
				int menor = valor3;
				System.out.println("Medio: " + valor2 + " \nmenor: " + valor3);
				
				}
			} else {
				int medio = valor3;
				int menor = valor2;
				System.out.println("Medio: " + valor3 + " \nmenor: " + valor2);
				
				}
			}
			
		} else if (valor2 >= valor1 && valor2 >= valor3) {
			int maior = valor2;
			System.out.println("valor2 é maior: " + valor2);
			if (valor1 >= valor3) {
				int medio = valor1;
				int menor = valor3;
				System.out.println("Medio: " + valor1 + " \nmenor: " + valor3);
				
					
				}
			} else {
				int medio = valor3;
				int menor = valor1;
				System.out.println("Medio: " + valor3 + " \nmenor: " + valor1);
					
				}
			}
		} else if (valor3 >= valor1 && valor3 >= valor2) {
			int maior = valor3;
			System.out.println("valor3 é maior: " + valor3);
			if (valor1 >= valor2) {
				int medio = valor1;
				int menor = valor2;
				System.out.println("Medio: " + valor1 + " \nmenor: " + valor2);
				
				}
			} else {
				int medio = valor3;
				int menor = valor2;
				System.out.println("Medio: " + valor3 + " \nmenor: " + valor2);
				
				}
			}
		}
		
	}

}
