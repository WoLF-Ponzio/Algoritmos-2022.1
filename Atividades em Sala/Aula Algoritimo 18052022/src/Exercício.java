import java.util.Scanner;
public class Exercício {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double y = 0;
	int n, contador;
	
	do {
		System.out.print("Digite um valor maior que zero: ");
		n = teclado.nextInt();
		if (n < 0) {
			System.out.println("\nDeve ser um valor positivo!");
		}
	 }while (n < 0);
		
		contador = 1;
		while(contador <= n) {
			y = y + contador / Math.sqrt(contador);
			contador ++;
		}
		System.out.println("y = " + y);
	}
}