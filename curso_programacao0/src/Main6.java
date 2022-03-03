import java.util.Scanner;

public class Main6 {
	//utilizando switch e cases...
	public static void main(String[] args) {
		String dia;
		int nmr_dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do dia da semana: ");
		nmr_dia = sc.nextInt();
		
		switch(nmr_dia) {
		case 1:
			dia = "Domingo";
			break;
		case 2: 
			dia="Segunda";
			break;
		case 3:
			dia="Terça";
			break;
		case 4:
			dia="Quarta";
			break;
		case 5:
			dia="Quinta";
			break;
		case 6: 
			dia="Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		System.out.println("O número informado corresponde a(o) dia da semana :"+dia);
		sc.close();

	}

}
