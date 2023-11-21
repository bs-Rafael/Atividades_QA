package att;
import java.util.Scanner;
public class Att8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o numero total de eleitores do municipio: ");
		int total=sc.nextInt();
		System.out.println("Digite o numero total de votos brancos: ");
		int brancos=sc.nextInt();
		System.out.println("Digite o numero total de votos nulos: ");
		int nulos=sc.nextInt();
		System.out.println("Digite o total de votos validos: ");
		int validos=sc.nextInt();
		int porcentagemBrancos=(brancos/total)*100;
		int porcentagemNulos=(nulos/total)*100;
		int porcentagemValidos=(validos/total)*100;
		System.out.println("A porcentagem de votos brancos e de : "+porcentagemBrancos+" votos.");
		System.out.println("A porcentagem de votos nulos e de : "+porcentagemNulos+" votos.");
		System.out.println("A porcentagem de votos validos e de : "+porcentagemValidos+" votos.");
		sc.close();

	}

}
