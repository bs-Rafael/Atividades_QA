package att;
import java.util.Scanner;

public class Att7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite quantos anos voce tem: ");
		int anos=sc.nextInt();
		System.out.println("Digite quantos meses voce tem: ");
		int meses=sc.nextInt();
		System.out.println("Digite quantos dias voce tem: ");
		int dias=sc.nextInt();
		int idadeDias=(anos*365)+(meses*30)+dias;
		System.out.println("Sua idade em dias e: "+idadeDias);
		sc.close();
	}

}
