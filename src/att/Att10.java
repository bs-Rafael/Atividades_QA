package att;
import java.util.Scanner;
public class Att10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual o valor do carro? ");
		int valorCarro=sc.nextInt();
		int distribuidor=(valorCarro*28)/100;
		int impostos=(valorCarro*48)/100;
		int valorFinal=impostos+distribuidor+valorCarro;
		System.out.println("O valor final para o consumidor é: "+valorFinal);
		sc.close();

	}

}
