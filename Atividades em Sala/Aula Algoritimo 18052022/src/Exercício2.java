import java.util.Iterator;
import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int x;
	
	do {
		System.out.print("Insira um n�mero Interio e Positivo: ");
		x = teclado.nextInt();
	if (x <= 0) {
		System.out.println("N�mero inv�lido");
	}
	}while (x < 0);
	
	
	for (int count = -x; count <= x; count++) {
		if (count != 0 && x % count == 0) {
			System.out.println(x/count);
		}
	}
	
	}

}
