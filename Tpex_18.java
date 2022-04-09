/*

Fabricio Carlos Guimarães CB3014886
Letícia Vitória Rodrigues Rosa CB3013138

18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.

*/

import java.util.Scanner;

public class Tpex_18{
	public static void main(String args[]){
	
		System.out.println("Digite o valor do produto 1:");
		Scanner scan = new Scanner(System.in);
		float p_1= scan.nextFloat();
		System.out.println("Digite o valor do produto 2:");
		float p_2= scan.nextFloat();
		System.out.println("Digite o valor do produto 3:");
		float p_3= scan.nextFloat();
		System.out.println("Digite o valor do produto 4:");
		float p_4= scan.nextFloat();
		System.out.println("Digite o valor do produto 5:");
		float p_5= scan.nextFloat();
		System.out.println("Digite o valor do pagamento:");
		float pag= scan.nextFloat();
		float t = pag - (p_1+p_2+p_3+p_4+p_5);
		System.out.println("Valor do troco: "+t);
	}
}