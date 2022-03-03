import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		double a;
		int b;
		a = 5.0;
		b = (int) a;
		System.out.println(b); 
		
		char name;
		Scanner ty = new Scanner(System.in);
		name = ty.next().charAt(0);
		ty.close();
		System.out.println("Pegando apenas a primeira letra de um nome digitado...");
		System.out.println(name);
		
		
	}

}
