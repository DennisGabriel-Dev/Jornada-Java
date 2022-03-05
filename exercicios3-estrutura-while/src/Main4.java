import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N;
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double media = 0;
		System.out.printf("Digite a quantidade de casos de teste: \n");
		N = sc.nextInt();
		
		while(N>0) {
			System.out.printf("Informe o primeiro valor: \n");
			n1 = sc.nextDouble();
			
			System.out.printf("Informe o segundo valor: \n");
			n2 = sc.nextDouble();
			
			System.out.println("Informe o terceiro valor: ");
			n3 = sc.nextDouble();
			
			media = (n1+n2+n3)/3;
			System.out.printf("A média entre os números infoemados é: %.1f \n",media);
			N--;
			
		}
		
		
		sc.close();
	}

}
