import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N ;	
		int Fatorial=1;
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
				Lembrando que, por definição, fatorial de 0 é 1.*/
		System.out.println("Informe o valor de um número: ");
		N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			Fatorial = Fatorial * i;
		}
		
		System.out.println(Fatorial);
		
		sc.close();
	}

}
