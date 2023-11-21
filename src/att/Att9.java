package att;
import java.util.Scanner;
public class Att9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o salário mensal: ");
		int salMensal=sc.nextInt();
		System.out.println("Digite o percententual de reajuste: ");
		int percentual=sc.nextInt();
		int reajuste=(salMensal*percentual)/100;
		int salFinal=reajuste+salMensal;
		System.out.println("O salário mensal é de : "+salFinal);
		sc.close();

	}
	

}
