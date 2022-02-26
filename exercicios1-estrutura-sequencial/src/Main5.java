import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int nmr1 , nmr2 , cdg1 , cdg2;
		double vlr1 , vlr2;
		
		System.out.println("Digite o código da peça 1");
		cdg1 = in.nextInt();
		
		System.out.println("Digite o número de peças 1:");
		nmr1 = in.nextInt();
		
		System.out.println("Digite o Valor Unitário da Peça 1: ");
		vlr1 = in.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		cdg2 = in.nextInt();
		
		System.out.println("Digite o número de peças 2: ");
		nmr2 = in.nextInt();
		
		System.out.println("Digite o valor Unitário da peça 2: ");
		vlr2 = in.nextDouble();
		
		in.close();
		
		System.out.println("O valor a ser pago é R$: " + ((nmr1*vlr1)+(nmr2*vlr2)));
	}

}