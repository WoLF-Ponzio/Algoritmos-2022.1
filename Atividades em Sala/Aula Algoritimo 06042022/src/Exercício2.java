import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c,delta,x1,x2;
	
	System.out.println("Calculadora de Equação de 2º Grau");
	System.out.println();
	System.out.print("Incira o valor de A: ");
	a = teclado.nextDouble();
	if (a == 0) {
		System.out.println("Essa não é uma equação 2º Grau");
		} else {
	System.out.print("Incira o valor de B: ");
	b = teclado.nextDouble();
	System.out.print("Incira o valor de C: ");
	c = teclado.nextDouble();
	System.out.println();
	
	delta = (b * b - 4 * a * c);
	if (delta <= 0) {
		System.out.println("A raíz não pertence aos reais");
		
	} else {
		
	x1 = (-b + Math.sqrt(delta))/(2*a);
	x2 = (-b - Math.sqrt(delta))/(2*a);
	
	System.out.println("A primeira raíz é: " + String.format("%.3f", x1) + " e segunda raíz é: " + String.format("%.3f", x2));
	
			}	
		}
	}

}
