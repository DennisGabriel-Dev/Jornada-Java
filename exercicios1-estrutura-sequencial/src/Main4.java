import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.println("Digite o n�mero do funcion�rio: ");
		int numeroFuncionario = op.nextInt();
		
		System.out.println("Informe sua quantidade de horas trabalhadas: ");
		double qtdHorasTrabalhadas = op.nextDouble();
		
		System.out.println("Informe o Valor que ele recebe por hora: ");
		double valorHora = op.nextDouble();
		op.close();

		double salario = qtdHorasTrabalhadas*valorHora;
		
		System.out.println("O n�mero do funcion�rio �: "+ numeroFuncionario);
		System.out.printf("O salario do Funcionario � R$: %.2f \n",salario);
		}

}
