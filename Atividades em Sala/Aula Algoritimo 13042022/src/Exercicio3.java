import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int x,x2,x3;
	
	System.out.print("Insira o valor do primeiro n�mero: ");
	x = teclado.nextInt();
	System.out.print("Insira o valor do segundo n�mero: ");
	x2 = teclado.nextInt();
	System.out.print("Insira o valor do terceiro n�mero: ");
	x3 = teclado.nextInt();
	
	if (x == x2 || x == x3 || x2 == x3) {
		System.out.println("Os n�meros s�o iguais");
	}else {
		if (x < x2 && x < x3) {
			System.out.println(x + " � o menor valor");
		}else if (x2 < x3) {
			System.out.println(x2 + " � o menor valor");
		}else {
			System.out.println(x3 + " � o menor valor");
		}
			
		
		
	}
	
	}

}
