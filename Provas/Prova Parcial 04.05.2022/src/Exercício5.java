import java.util.Scanner;
public class Exerc�cio5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a,b,c,d;
	
	System.out.print("digite o 1� n�mero: ");
	a = teclado.nextInt();
	System.out.print("digite o 2� n�mero: ");
	b = teclado.nextInt();
	System.out.print("digite o 3� n�mero: ");
	c = teclado.nextInt();
	System.out.print("digite o 4� n�mero: ");
	d = teclado.nextInt();
	
	if (a < b && b < c && c < d) {
		System.out.println("Os n�meros est�o em ordem crescente!");
	}else if (a > b && b > c && c > d) {
		System.out.println("Os n�meros est�o em ordem decresente!");
	}else {
		System.out.println("Os n�meros n�o est�o ordenados!");
	}
	}

}
