import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Código:   Nome do lanche:     Valor:\n\n1     |   Cachorro Quente     | R$ 4,00\n2     |   X-Salada "
				+ "           | R$ 4,50 \n3     |   X-Bacon             | R$ 5,00\n4     |   Torrada Simples     | R$ 2,00\n5     |   Refrigerante        | R$ 1,50");
		System.out.println("\nDigite o código do seu produto:");
		int codigoLanche = sc.nextInt();

		System.out.println("Digite a Quantidade Desejada:");
		int qtdDesejada = sc.nextInt();
		System.out.println("\n");
		if(codigoLanche==1) {
			double valorTotal = qtdDesejada * 4.00;
			System.out.printf("O valor total a ser pago é: R$ %.2f",valorTotal);
		}
		if(codigoLanche==2) {
			double valorTotal = qtdDesejada * 4.50;
			System.out.printf("O valor total a ser pago é: R$ %.2f",valorTotal);
		}
		if(codigoLanche==3) {
			double valorTotal = qtdDesejada * 5.00;
			System.out.printf("O valor total a ser pago é: R$ %.2f",valorTotal);
		}
		if(codigoLanche==4) {
			double valorTotal = qtdDesejada * 2.00;
			System.out.printf("O valor total a ser pago é: R$ %.2f",valorTotal);
		}
		if(codigoLanche==5) {
			double valorTotal = qtdDesejada * 1.50;
			System.out.printf("O valor total a ser pago é: R$ %.2f",valorTotal);
		}
		sc.close();
	}

}
