/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
 */

import java.util.Scanner;


public class Tpex_04{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite a base do triangulo(metros):");
int base = scan.nextInt();

System.out.println("Digite a altura do triangulo(metros):");
int altura = scan.nextInt();


double area = (base*altura)/2;


System.out.println("A área do triângulo é: " + area + "m²");


}
}