import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro e 
		 * dizer se este n�mero � par ou �mpar.*/
		
		Scanner sc = new Scanner(System.in);
		int nmr;
		System.out.println("Digite um n�mero inteiro: ");
		nmr = sc.nextInt();
		
		if(nmr%2==0) {
			System.out.println("PAR");
		}else {
			System.out.println("�MPAR");
		}
		
		sc.close();
		
	}
}
