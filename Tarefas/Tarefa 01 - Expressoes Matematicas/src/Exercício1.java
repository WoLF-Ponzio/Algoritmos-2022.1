import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double a,b,c,d,e,f,y;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("insira o valor de a: ");
		a = teclado.nextDouble(); 
		System.out.print("insira o valor de b: ");
		b = teclado.nextDouble();
		System.out.print("insira o valor de c: ");
		c = teclado.nextDouble();
		System.out.print("insira o valor de d: ");
		d = teclado.nextDouble();
		System.out.print("insira o valor de e: ");
		e = teclado.nextDouble();
		System.out.print("insira o valor de f: ");
		f = teclado.nextDouble();
		
		y = (a+(b/c))/(d-(e/f));
		System.out.println(y);



	}

}
