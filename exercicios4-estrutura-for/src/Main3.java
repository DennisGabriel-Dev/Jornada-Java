import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5*/
		int N;
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;		
		double media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Infome a quantidade de casos a serem testados: ");
		N = sc.nextInt();
		
		for(int i = 0; i<N ; i++) {
			System.out.println("Informe o valor 1: ");
			valor1 = sc.nextDouble();
			System.out.println("Informe o valor 2: ");
			valor2 = sc.nextDouble();
			System.out.println("Informe o valor 3: ");
			valor3 = sc.nextDouble();
			
			media = (valor1+valor2+valor3)/3;
			System.out.printf("A media dos valores é: %.1f \n", media);
		}
		
		
		sc.close();

	}

}
