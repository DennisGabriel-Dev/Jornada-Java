import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		int A = in.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int B = in.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int C = in.nextInt();
		
		System.out.println("Informe o valor de D: ");
		int D = in.nextInt();
		in.close();
		
		int diferen�a = (A * B - C * D);
		
		System.out.println("A diferen�a entre os produtos de A e B, C e D �/s�o: "+diferen�a);
		
	}

}
