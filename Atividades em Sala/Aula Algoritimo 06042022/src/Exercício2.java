import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c,delta,x1,x2;
	
	System.out.println("Calculadora de Equa��o de 2� Grau");
	System.out.println();
	System.out.print("Incira o valor de A: ");
	a = teclado.nextDouble();
	if (a == 0) {
		System.out.println("Essa n�o � uma equa��o 2� Grau");
		} else {
	System.out.print("Incira o valor de B: ");
	b = teclado.nextDouble();
	System.out.print("Incira o valor de C: ");
	c = teclado.nextDouble();
	System.out.println();
	
	delta = (b * b - 4 * a * c);
	if (delta <= 0) {
		System.out.println("A ra�z n�o pertence aos reais");
		
	} else {
		
	x1 = (-b + Math.sqrt(delta))/(2*a);
	x2 = (-b - Math.sqrt(delta))/(2*a);
	
	System.out.println("A primeira ra�z �: " + String.format("%.3f", x1) + " e segunda ra�z �: " + String.format("%.3f", x2));
	
			}	
		}
	}

}
