import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
		Scanner in = new Scanner(System.in);
		int N ;
		double divisor1, divisor2 = 0;
		double denominador = 0;
		System.out.println("Informe a quantidade de multiplicações a serem feitas: ");
		N = in.nextInt();
		for(int i = 0; i<N ; i++) {
			System.out.println("Informe dois valores que serão divididos na ordem: 1° numerador , 2° divisor: ");
			divisor1 = in.nextInt();
			divisor2 = in.nextInt();
			denominador = divisor1/divisor2;
			
			if(divisor2==0) {
				System.out.println("Divisão Impossível!!!");
			}
			else {
				System.out.println("Resultado: " + denominador);
			}
		}
		
		
		in.close();
	}

}
