import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)*/
		Scanner sc = new Scanner(System.in);
		int X = 1;
		int Y = 1;
		
		while(X!=0 && Y!=0)
		{
			System.out.println("Informe o valor de X:");
			X = sc.nextInt();
			
			System.out.println("Informe o valor de Y:");
			Y = sc.nextInt();
			
			if(X>0 && Y>0) {
				System.out.println("Primeiro Quadrante");
			}
			else if(X<0 && Y>0) {
				System.out.println("Segundo Quadrante");
			}
			else if(X<0 && Y<0) {
				System.out.println("Terceiro Quadrante");
			}
			else if(Y<0 && X>0) {
				System.out.println("Quarto Quadrante");
			}
		}		
		
		sc.close();
	}

}
