import java.util.Locale;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double minutosLigacao;
		double valor = 50.00;
		
		System.out.println("Digite o total de minutos da ligação: ");
		minutosLigacao = sc.nextDouble();
		
		if(minutosLigacao>100) {
			valor += (minutosLigacao-100) * 2.00;
		}
		System.out.printf("A ligação custou: R$ %.2f", valor);
		sc.close();
		
	}
}
