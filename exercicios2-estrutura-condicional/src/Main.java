import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro, e 
		 * depois dizer se este n�mero � negativo ou n�o.*/
	Scanner sc = new Scanner(System.in);
	int nmr;
		System.out.println("Digite um N�mero Inteiro: ");
		nmr = sc.nextInt();
		if(nmr<0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("N�O NEGATIVO");
		}
		
	sc.close();
	}

}
