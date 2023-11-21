package att;

import java.util.Scanner;

public class Att16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantas maçãs foram compradas? ");
		int compra=sc.nextInt();
		if(compra>=12) {
			int maca=1;
			System.out.println("A compra de "+compra+" custou: "+compra*maca);
		}
		else {
			double maca=1.60;
			System.out.println("A compra de "+compra+" custou: "+compra*maca);
		}
		sc.close();

	}

}
