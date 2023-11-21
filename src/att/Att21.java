package att;
import java.util.Scanner;
public class Att21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual a hora de inicio do jogo? ");
		int horaInicio=sc.nextInt();
		System.out.println("Qual a hora de termino do jogo? ");
		int horaTermino=sc.nextInt();
		int duracao=horaTermino-horaInicio;
		if(duracao>24) {
			System.out.println("O jogo excedeu o limite de tempo");
		}
		else {
			System.out.println("O jogo não excedeu o limite de tempo");
		}
		sc.close();

	}

}
