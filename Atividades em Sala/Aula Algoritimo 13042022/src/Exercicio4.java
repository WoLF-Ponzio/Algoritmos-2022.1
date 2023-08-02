import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		int x,x2,x3,x4;
			
		System.out.print("Insira o primeiro valor: ");
		x = teclado.nextInt();
		System.out.print("Incira o segundo valor: ");
		x2 = teclado.nextInt();
		System.out.print("Insira o terceiro valor: ");
		x3 = teclado.nextInt();
			
		if (x > x2) {
				x4 = x;
				x = x2;
				x2 = x4;
		}else if (x2 > x3) {
				x4 = x2;
				x2 = x3;
				x2 = x4;
		}else if (x > x3) {
				x4 = x;
				x = x3;
				x3 = x4;
		}
			System.out.println(x + " " + x2 + " " + x3);
	}
	

}


