/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.

*/

import java.util.Scanner;

public class Tpex_10{
	public static void main(String args[]){
	
		System.out.println("Digite o valor da temperatura, em graus Celsius:");
		Scanner scan = new Scanner(System.in);
		float temp_c = scan.nextFloat();
		double temp_f = (((9*temp_c)/5) + 32);
		System.out.println("Temperatura em graus Celsius: "+temp_c+"C°;\nTemperatura em graus Fahrenheit: "+temp_f+"F°.");
	}
}