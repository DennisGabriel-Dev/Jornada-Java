import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		/*Ler um n�mero inteiro N e calcular todos os seus divisores*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int nmr = sc.nextInt();
		
		for(int i = 1; i<=nmr ; i++) {
			if(nmr%i == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
