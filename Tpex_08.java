/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.


 */

import java.util.Scanner;


public class Tpex_08{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite as milhas maritimas:");
double milhas = scan.nextInt();

double km = milhas*1.852;


System.out.println("O valor em KM e: " + km + " km.");


}
}