import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro, e 
		 * depois dizer se este número é negativo ou não.*/
	Scanner sc = new Scanner(System.in);
	int nmr;
		System.out.println("Digite um Número Inteiro: ");
		nmr = sc.nextInt();
		if(nmr<0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
	sc.close();
	}

}
