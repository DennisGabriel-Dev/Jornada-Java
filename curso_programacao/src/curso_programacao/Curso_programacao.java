
package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


public class Curso_programacao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome, Por favor");
        String nome = in.nextLine();
        
        System.out.printf("Olá, %s " ,nome );
        System.out.println(", Bom Dia!!!");
        
        double x = 3.2728;
        System.out.println(x);
        System.out.printf("%.2f\n", x); 
        System.out.printf("%.4f\n" , x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n" , x);
        
        
        nome = "Maria";
        int idade = 34;
        double renda = 4000.0;
        
        System.out.printf("%s , tem %d anos e ganha R$ %.2f %n" , nome, idade, renda);
    }
    
}
