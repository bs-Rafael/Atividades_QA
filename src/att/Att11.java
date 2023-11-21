package att;
import java.util.Scanner;
public class Att11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o salário mensal: ");
		int salarioFixo=sc.nextInt();
		System.out.println("Digite o valor da comissão por vendas: ");
		int comissao=sc.nextInt();
		System.out.println("Quantos carros foram vendidos? ");
		int carrosVendidos=sc.nextInt();
		if(carrosVendidos>=1) {
			System.out.println("Qual o valor das vendas?");
			int bonusVendas=sc.nextInt();
			int porcentagemBonus=(bonusVendas*5)/100;
			int salarioFinal=(comissao*carrosVendidos)+porcentagemBonus+salarioFixo;
			System.out.println("O salario final do vendedor é de : "+salarioFinal);
		}else {
			System.out.println("O salario do vendedor é de: "+salarioFixo);
		}
		sc.close();

	}

}
