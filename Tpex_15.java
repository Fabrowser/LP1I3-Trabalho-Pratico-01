/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA RODRIGUES ROSA CB3013138

15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).

 */
 
import java.util.Scanner;


public class Tpex_15{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o valor da cotação do dolar:  ");
double cot  = scan.nextInt();

System.out.println("Digite o valor em dolares:  ");
double valor = scan.nextInt();

double reais = valor * cot;

System.out.println("O Voalor em Reais e de R$ " + reais +  " REAIS");


}
}
