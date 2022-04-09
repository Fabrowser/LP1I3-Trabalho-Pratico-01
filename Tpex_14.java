/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
digitados.

*/

import java.util.Scanner;

public class Tpex_14{
	public static void main(String args[]){
	
		System.out.println("Digite o raio da esfera:");
		Scanner scan = new Scanner(System.in);
		float r= scan.nextFloat();
		System.out.println("Digite o valor da aresta do cubo:");
		float a= scan.nextFloat();
		double v_e = (4/3)*Math.PI*Math.pow(r,3);
		double v_c = Math.pow(a,3);
		double v = v_c - v_e;
		System.out.println("Volume livre do ambiente: "+v);
	}
}