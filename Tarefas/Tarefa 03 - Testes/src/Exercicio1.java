import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c;
	
	System.out.println("Classificador de tri�ngulos");
	System.out.print("Digite o primeiro valor: ");
	a = teclado.nextDouble();
	System.out.print("Digite o segundo valor: ");
	b = teclado.nextDouble();
	System.out.print("Digite o terceiro valor: ");
	c = teclado.nextDouble();
	
	if (a>(b+c) || b>(a+c) || c>(a+b)){
		System.out.println("N�o � um tri�ngulo v�lido");
	}else if (a == b && b == c) {
		System.out.println("O tri�ngulo � equilatero!");	
	}else if (a == b || b == c || c == a) {
		System.out.println("O tri�ngulo � is�celes");
	}else {
		System.out.println("O tri�ngulo � escaleno");
	}
		
			
	}		
}	
		
		
	

