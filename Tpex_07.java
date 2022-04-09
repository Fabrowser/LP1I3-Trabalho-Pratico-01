/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.


 */

import java.util.Scanner;


public class Tpex_07{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o primeiro numero:");
double n1 = scan.nextInt();

System.out.println("Digite o segundo numero:");
double n2 = scan.nextInt();


double result = n1*n2;

double med_geo = Math.sqrt(result);



System.out.println("A media geometrica e: " + med_geo);


}
}