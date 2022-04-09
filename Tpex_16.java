/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.

*/

import java.util.Scanner;

public class Tpex_16{
	public static void main(String args[]){
	
		System.out.println("Digite o valor do angulo (em graus):");
		Scanner scan = new Scanner(System.in);
		int ang = scan.nextInt();
		double rad = Math.toRadians(ang);
		double seno = Math.sin(rad);
		double cos = Math.cos(rad);
		double tan = Math.tan(rad);
		double sec = 1/cos;
		System.out.println("Angulo: "+ang+";\nSeno: "+seno+";\nCosseno: "+cos+";\nTangente: "+tan+";\nSecante: "+sec);
	}
}