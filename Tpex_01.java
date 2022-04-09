
/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

1
 * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.

 */


import java.util.Scanner;

/* Programa calcula a area do Retangulo*/


public class Tpex_01{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite a base do retangulo(metros):");
int base= scan.nextInt();


System.out.println("Digite a altura do retangulo (metros):");
int altura = scan.nextInt();

double area = base*altura;  


System.out.println("A área do Retangulo é: " + area + "m²");


}
}