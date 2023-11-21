package att;
import java.util.Scanner;
public class Att24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor do salário fixo: ");
		int salarioFixo=sc.nextInt();
		System.out.println("Digite o valor das vendas: ");
		int valorVendas=sc.nextInt();
		if(valorVendas<150000) {
			int comissao=(valorVendas*3)/100;
			System.out.println("O salário final é de "+(comissao+salarioFixo));
		}
		else {
			int comissao=(valorVendas*5)/100;
			System.out.println("O salário final é de "+(comissao+salarioFixo));
		}
		sc.close();

	}

}
