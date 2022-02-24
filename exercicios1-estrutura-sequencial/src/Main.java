import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner ty = new Scanner(System.in);
	
	int a, b , soma ;
	System.out.println("Digite os valores: ");
	a = ty.nextInt();
	b = ty.nextInt();
	ty.close();
	soma = a + b;
	System.out.printf("Os valores informados foram: %d e %d \n", a , b);
	System.out.printf("A soma deles é: %d ", soma);
	}
}
