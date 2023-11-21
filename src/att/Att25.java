package att;
import java.util.Scanner;
public class Att25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o número da conta: ");
		String numeroConta=sc.next();
		System.out.println("Digite o saldo da conta: ");
		int saldo=sc.nextInt();
		System.out.println("Digite o débito da conta: ");
		int debito=sc.nextInt();
		System.out.println("Digite o crédito da conta: ");
		int credito=sc.nextInt();
		int saldoAtual=saldo-debito+credito;
		if(saldoAtual>=0) {
			System.out.println("Seu saldo é positivo.");
		}
		else {
			System.out.println("Seu saldo é negativo: ");
		}
		sc.close();
	}

}
