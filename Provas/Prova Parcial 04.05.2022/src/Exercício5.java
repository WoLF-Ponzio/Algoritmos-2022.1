import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a,b,c,d;
	
	System.out.print("digite o 1º número: ");
	a = teclado.nextInt();
	System.out.print("digite o 2º número: ");
	b = teclado.nextInt();
	System.out.print("digite o 3º número: ");
	c = teclado.nextInt();
	System.out.print("digite o 4º número: ");
	d = teclado.nextInt();
	
	if (a < b && b < c && c < d) {
		System.out.println("Os números estão em ordem crescente!");
	}else if (a > b && b > c && c > d) {
		System.out.println("Os números estão em ordem decresente!");
	}else {
		System.out.println("Os números não estão ordenados!");
	}
	}

}
