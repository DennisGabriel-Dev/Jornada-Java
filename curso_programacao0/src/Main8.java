import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int x = sc.nextInt();
		int soma = 0;
		
		while(x!=0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma de todos os valores digitados � igual a: "+ soma);
		sc.close();
	}
}
