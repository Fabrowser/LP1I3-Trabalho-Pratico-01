/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

*/

import java.util.Scanner;

public class Tpex_11{
	public static void main(String args[]){
	
		System.out.println("Digite o valor do diametro do circulo:");
		Scanner scan = new Scanner(System.in);
		float diam = scan.nextFloat();
		double area = Math.PI * Math.pow((diam/2),2);
		System.out.println("Area do circulo: "+area);
	}
}