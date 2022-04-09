/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.

*/

import java.util.Scanner;

public class Tpex_17{
	public static void main(String args[]){
	
		System.out.println("Digite o valor da base (X):");
		Scanner scan = new Scanner(System.in);
		float x= scan.nextFloat();
		System.out.println("Digite o valor o expoente (Y):");
		float y= scan.nextFloat();
		double result = Math.pow(x, y);
		System.out.println("Valor de X elevado a Y: "+result);
	}
}