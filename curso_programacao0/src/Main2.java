import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int idade;
		double salario;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Digite o seu nome, idade e salário:");
		name=sc.next();
		idade=sc.nextInt();
		salario = sc.nextDouble();
		
		System.out.printf("Os dados digitados foram:\n %s \n %d \n %.2f ", name,idade,salario);
		
		sc.close();
	}
}
