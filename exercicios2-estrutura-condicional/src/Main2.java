import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e 
		 * dizer se este número é par ou ímpar.*/
		
		Scanner sc = new Scanner(System.in);
		int nmr;
		System.out.println("Digite um número inteiro: ");
		nmr = sc.nextInt();
		
		if(nmr%2==0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		
	}
}
