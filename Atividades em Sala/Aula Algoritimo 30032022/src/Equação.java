import java.util.Scanner;
public class Equa��o {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double x, y;
	
	System.out.print("Incira o valor de x: ");
	x = teclado.nextDouble();
	if (x >= -5 && x <= 5) {
		System.out.println("Valor de X � inv�lido");
	}else {
		y = (x-8)/Math.sqrt(x*x-25);
	System.out.println("O valor da equa��o �: " + String.format("%.3f", y));
	}
	
	
	}

}
