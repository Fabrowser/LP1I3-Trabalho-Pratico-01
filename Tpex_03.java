/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
 */


import java.util.Scanner;


public class Tpex_03{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite a diagonal do quadrado (metros):");
int diagonal = scan.nextInt();



double lado = (diagonal/Math.sqrt(2));

double area = lado*lado;

System.out.println("A área do quadrado é: " + lado + "m²");


}
}