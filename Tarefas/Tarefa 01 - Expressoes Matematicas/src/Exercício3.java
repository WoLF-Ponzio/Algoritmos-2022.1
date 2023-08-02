import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,f,x;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Incira o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Incira o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Incira o valor de F: ");
		f = teclado.nextDouble();
		
		x = (Math.sqrt(2*b - 4*a) + (2 * Math.pow(f, -3)))/(3-2*a);
		System.out.print(x);		
				
		
	}

}
