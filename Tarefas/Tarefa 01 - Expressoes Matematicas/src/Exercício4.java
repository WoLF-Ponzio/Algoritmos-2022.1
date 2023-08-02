import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d,e,f,g,h,i,j,x;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = teclado.nextDouble();
		System.out.print("Insira o valor de D: ");
		d = teclado.nextDouble();
		System.out.print("Insira o valor de E: ");
		e = teclado.nextDouble();
		System.out.print("Insira o valor de F: ");
		f = teclado.nextDouble();
		System.out.print("Insira o valor de G: ");
		g = teclado.nextDouble();
		System.out.print("Insira o valor de H: ");
		h = teclado.nextDouble();
		System.out.print("Insira o valor de I: ");
		i = teclado.nextDouble();
		System.out.print("Insira o valor de J: ");
		j = teclado.nextDouble();
		
		x = (((a-b) + (e+f)) / ((c-d) + (g+h)) * i/j);
		System.out.print(x);
 		
	}

}
