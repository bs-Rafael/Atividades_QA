package att;
import java.util.Scanner;
public class Att23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome=sc.next();
		System.out.println("Digite sua altura: ");
		double altura=sc.nextDouble();
		System.out.println("Digite seu sexo(M ou F): ");
		String sexo=sc.next();
		if(sexo.equals("M")) {
			double pesoIdeal=(72.7*altura)-58;
			System.out.println(nome+" Seu peso ideal é: "+pesoIdeal);
			
		}
		else {
			double pesoIdeal=(62.1*altura)-44.7;
			System.out.println(nome+" Seu peso ideal é: "+pesoIdeal);
		}
		sc.close();

	}

}
