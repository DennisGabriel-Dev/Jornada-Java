import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		double area = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor do Raio: ");
		double raio = in.nextDouble();
		in.close();
		area = 3.14159*Math.pow(raio,2);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da Área é: %.4f" ,area);
	}
}
