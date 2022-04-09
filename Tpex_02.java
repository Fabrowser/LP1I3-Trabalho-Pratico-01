
/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
 */

import java.util.Scanner;


public class Tpex_02{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o lado do quadrado (metros):");
int l = scan.nextInt();



double area = l*l;


System.out.println("A área do quadrado é: " + area + "m²");


}
}