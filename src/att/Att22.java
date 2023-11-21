package att;
import java.util.Scanner;
public class Att22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Quantas horas foram trabalhadas num mês? ");
		double horasTrabalhadas=sc.nextDouble();
		System.out.println("Qual o valor da hora trabalhada? ");
		double valorHora=sc.nextDouble();
		if(horasTrabalhadas>40.0) {
			double horasExtra=((((horasTrabalhadas-40.0))*valorHora)*1.5)+(40*valorHora);
			System.out.println("O salario final é "+horasExtra);
		}
		else {
			System.out.println("O salário final é: "+horasTrabalhadas*valorHora);
		}
		sc.close();

	}

}
