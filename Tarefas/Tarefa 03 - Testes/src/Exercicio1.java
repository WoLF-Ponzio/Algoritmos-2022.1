import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c;
	
	System.out.println("Classificador de triângulos");
	System.out.print("Digite o primeiro valor: ");
	a = teclado.nextDouble();
	System.out.print("Digite o segundo valor: ");
	b = teclado.nextDouble();
	System.out.print("Digite o terceiro valor: ");
	c = teclado.nextDouble();
	
	if (a>(b+c) || b>(a+c) || c>(a+b)){
		System.out.println("Não é um triângulo válido");
	}else if (a == b && b == c) {
		System.out.println("O triângulo é equilatero!");	
	}else if (a == b || b == c || c == a) {
		System.out.println("O triângulo é isóceles");
	}else {
		System.out.println("O triângulo é escaleno");
	}
		
			
	}		
}	
		
		
	

