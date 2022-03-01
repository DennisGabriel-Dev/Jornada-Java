import java.util.Scanner;

public class Main7 {
  public static void main(String[] args) {
	  /*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/
	  Scanner in = new Scanner(System.in);
	  double x,y;
	 System.out.println("Digite as cordenadas:");
	 System.out.println("x:");
	 x=in.nextDouble();
	 System.out.println("y:");
	 y=in.nextDouble();
	 
	 in.close();
	 
	 if(x>0 && y>0) {
		 System.out.println("Q1");
	 }else if(x<0 && y>0) {
		 System.out.println("Q2");
	 }else if(x<0 && y<0) {
		 System.out.println("Q3");
	 }else if(x>0 && y<0) {
		 System.out.println("Q4");
	 }else if(x==0 && y ==0) {
		 System.out.println("Origem");
	 }
 }
}
