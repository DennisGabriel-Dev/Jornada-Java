import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva 
um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� 
que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme 
exemplo*/
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�lcool \n2.Gasolina \n3.Diesel \n4.Fim");
		int tipoCombustivel = 0;
		
		while(tipoCombustivel != 4) {
			System.out.println("Informe o seu Combust�vel desejado: ");
			tipoCombustivel = sc.nextInt();
			if(tipoCombustivel == 1) {
				System.out.println("�lcool");
			
				}
			else if(tipoCombustivel == 2) {
					System.out.println("Gasolina");
					
				}
			else if(tipoCombustivel == 3) {
				System.out.println("Diesel");
				
			}
			else if(tipoCombustivel!=1 && tipoCombustivel!=2 && tipoCombustivel!=3 && tipoCombustivel!=4) {
				System.out.println("Informe Um valor V�lido!!!!");
			}

			}
		System.out.println("Programa Encerrado");
		
		sc.close();
	}
}
