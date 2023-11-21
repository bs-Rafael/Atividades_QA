package att;

import java.util.Scanner;

public class Att12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a temperatura em farenheit: ");
		double farenheit=sc.nextInt();
		double celsius=(farenheit-32)/1.8;
		System.out.println("A temperatura em celsius é de: "+celsius);
		sc.close();

	}

}
