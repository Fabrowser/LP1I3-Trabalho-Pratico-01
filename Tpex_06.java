/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.



 */

import java.util.Scanner;


public class Tpex_06{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o primeiro numero:");
double n1 = scan.nextInt();

System.out.println("Digite o segundo numero:");
double n2 = scan.nextInt();


System.out.println("Digite o terceiro numero:");
double n3 = scan.nextInt();


System.out.println("Digite o quarto numero:");
double n4 = scan.nextInt();


double media = (n1+n2+n3+n4)/4


System.out.println("A média dos quatro numeros é: " + media);


}
}