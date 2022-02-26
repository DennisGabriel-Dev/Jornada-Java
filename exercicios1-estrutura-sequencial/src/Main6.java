import java.util.Locale;
import java.util.Scanner;
public class Main6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double A, B, C;
		System.out.println("Informe o valor de A: ");
		A = in.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		B = in.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		C = in.nextDouble();
		in.close();
		
		double triangulo= A*C/2;
		double areaCirculoRaio = 2*3.14159*(Math.pow(C,2))/2;
		double trapezio = ((A+B)*C)/2;
		double quadrado = Math.pow(B , 2);
		double retangulo = A * B;
		
		System.out.printf("O valor da área do triangulo é: %.3f \n", triangulo);
		System.out.printf("O valor da área do Círculo de Raio é : %.3f \n",areaCirculoRaio);
		System.out.printf("O valor da área do trapezio é: %.3f \n",trapezio);
		System.out.printf("O valor da área do quadrado é: %.3f \n",quadrado);
		System.out.printf("O valor da área do retangulo é: %.3f \n",retangulo);
	}
}
