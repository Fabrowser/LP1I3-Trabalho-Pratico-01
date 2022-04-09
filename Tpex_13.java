/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.

*/

import java.util.Scanner;

public class Tpex_13{
	public static void main(String args[]){
	
		System.out.println("Digite o valor da velocidade inicial (em m/s):");
		Scanner scan = new Scanner(System.in);
		float v_i= scan.nextFloat();
		System.out.println("Digite o valor da aceleracao (m/s2):");
		float a= scan.nextFloat();
		System.out.println("Digite o valor do tempo de percurso (em s):");
		float t= scan.nextFloat();
		float v_f = v_i + (a*t);
		System.out.println("Velocidade final: "+v_f);
	}
}