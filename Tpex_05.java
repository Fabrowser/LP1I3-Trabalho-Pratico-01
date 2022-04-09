/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.



 */
import java.util.Scanner;


public class Tpex_05{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o diâmetro da esfera(metros):");
double diametro = scan.nextInt();

double raio = diametro/2;


double area = ((4*3.14)*Math.pow(raio,3))/3;



System.out.println("A área da esfera é: " + area + "m²");


}
}