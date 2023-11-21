package att;
import java.util.Scanner;
public class Att34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor de X");
		int x=sc.nextInt();
		System.out.println("Digite o valor de Y");
		int y=sc.nextInt();
		int z=(x*y)+5;
		if(z<=0) {
			String resposta="A";
			System.out.println(resposta);
			
		}
		else if(z<=100){
			String resposta="B";
			System.out.println(resposta);
			
		}
		else {
			String resposta="C";
			System.out.println(resposta);
		}
		sc.close();

	}

}
