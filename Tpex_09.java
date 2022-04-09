/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.


 */

import java.util.Scanner;


public class Tpex_09{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite a corrente eletrica: ");
double i = scan.nextInt();

System.out.println("Digite a resistencia: ");
double r = scan.nextInt();



double v = i/r;


System.out.println("O valor da tensao e: " +  v + " VOLTS.");


}
}