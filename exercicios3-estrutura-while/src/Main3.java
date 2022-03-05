import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo*/
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
		int tipoCombustivel = 0;
		
		while(tipoCombustivel != 4) {
			System.out.println("Informe o seu Combustível desejado: ");
			tipoCombustivel = sc.nextInt();
			if(tipoCombustivel == 1) {
				System.out.println("Álcool");
			
				}
			else if(tipoCombustivel == 2) {
					System.out.println("Gasolina");
					
				}
			else if(tipoCombustivel == 3) {
				System.out.println("Diesel");
				
			}
			else if(tipoCombustivel!=1 && tipoCombustivel!=2 && tipoCombustivel!=3 && tipoCombustivel!=4) {
				System.out.println("Informe Um valor Válido!!!!");
			}

			}
		System.out.println("Programa Encerrado");
		
		sc.close();
	}
}
