package att;
import java.util.Scanner;
public class Att18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Em que ano estamos? ");
		int ano=sc.nextInt();
		System.out.println("Em que ano você nasceu? ");
		int idade=sc.nextInt();
		if(ano-idade>=16) {
			System.out.println("Você pode votar");
		}
		else {
			System.out.println("Você não pode votar");
		}
		sc.close();

	}

}
