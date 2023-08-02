import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int x,x2,x3;
	
	System.out.print("Insira o valor do primeiro número: ");
	x = teclado.nextInt();
	System.out.print("Insira o valor do segundo número: ");
	x2 = teclado.nextInt();
	System.out.print("Insira o valor do terceiro número: ");
	x3 = teclado.nextInt();
	
	if (x == x2 || x == x3 || x2 == x3) {
		System.out.println("Os números são iguais");
	}else {
		if (x < x2 && x < x3) {
			System.out.println(x + " é o menor valor");
		}else if (x2 < x3) {
			System.out.println(x2 + " é o menor valor");
		}else {
			System.out.println(x3 + " é o menor valor");
		}
			
		
		
	}
	
	}

}
