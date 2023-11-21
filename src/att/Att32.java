package att;
import java.util.Scanner;
public class Att32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o nome do time A: ");
		String timeA=sc.next();
		System.out.println("Digite a quantidade de gols do time A:");
		int golsA=sc.nextInt();
		System.out.println("Digite o nome do time B:");
		String timeB=sc.next();
		System.out.println("Digite a quantiade de gols do time B:");
		int golsB=sc.nextInt();
		if(golsA>golsB) {
			System.out.println(timeA+" venceu a partida!");
		}
		else if(golsA==golsB) {
			System.out.println("A partida foi um empate!");
		}
		else {
			System.out.println(timeB+" vendeu a partida!");
		}

		sc.close();
	}

}
