/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.

*/

import java.util.Scanner;

public class Tpex_12{
	public static void main(String args[]){
	
		System.out.println("Digite o valor da altura:");
		Scanner scan = new Scanner(System.in);
		float h= scan.nextFloat();
		System.out.println("Digite o valor do raio da base:");
		float r= scan.nextFloat();
		double v = (Math.PI * Math.pow(r,2) * h)/3;
		System.out.println("Volume do cone: "+v);
	}
}