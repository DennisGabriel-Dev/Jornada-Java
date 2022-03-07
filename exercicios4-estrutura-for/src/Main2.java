import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/
	
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int nmr = 0;
		int in = 0;
		int out = 0;
		System.out.println("Informe a quantidade de valores a serem lidos: ");
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			System.out.println("Informe um valor");
			nmr = sc.nextInt();
			if(nmr>=10 && nmr<=20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
			
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		System.out.println("Fim do Programa !!!");
		
		sc.close();
	 	}
}
