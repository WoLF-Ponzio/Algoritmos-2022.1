import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y,h,x;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o valor de H: ");
		h = teclado.nextDouble();
		System.out.print("Insira o valor de X: ");
		x = teclado.nextDouble();
		
		y = 2*h - Math.pow(45/(3*x) - (4*h*(3-h)), 2*h);
		System.out.print(y);
	}

}
