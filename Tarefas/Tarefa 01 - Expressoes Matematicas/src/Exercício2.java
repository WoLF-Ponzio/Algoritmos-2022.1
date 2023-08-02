import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o valor de X: ");
		x = teclado.nextDouble();
		
		y = (((2*Math.pow(x, 2)-3*Math.pow(x,x+1))/2) + ((Math.sqrt(x+1))/2))/Math.pow(2,x);
		
		System.out.println(y);
	}

}
