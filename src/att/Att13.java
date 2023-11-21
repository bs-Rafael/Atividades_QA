package att;

import java.util.Scanner;

public class Att13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		int nota1=sc.nextInt();
		System.out.println("Digite a segunda nota do aluno: ");
		int nota2=sc.nextInt();
		System.out.println("Digite a terceira nota do aluno: ");
		int nota3=sc.nextInt();
		double mediaFinal=((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.println("A media final do aluno é: "+mediaFinal);
		sc.close();

	}

}
