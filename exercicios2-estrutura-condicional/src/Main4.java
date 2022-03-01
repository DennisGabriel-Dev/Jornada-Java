import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
		 *  sabendo que o mesmo pode começar em um dia e terminar em outro,
		 *  tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		Scanner in = new Scanner(System.in);
		int horaInicial;
		int horaFinal;
		int duracao;
		System.out.println("Digite a hora inicial do jogo: ");
		horaInicial=in.nextInt();
		
		System.out.println("Digite a hora final do jogo: ");
		horaFinal=in.nextInt();
		
		if(horaFinal>horaInicial) {
			duracao = horaFinal-horaInicial ;
		}else {	
			duracao=24-horaInicial+horaFinal;
		}
		System.out.printf("A duração em horas do jogo foi: %d hora(s)",duracao);
		
		
		in.close();
	}

}
