import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		int v1, v2, resultado; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora Baiana");
		System.out.print("Por favor, digite um valor abaixo: ");
		v1 = teclado.nextInt();
		
		System.out.print("Digite um segundo valor: ");
		v2 = teclado.nextInt();
		resultado = v1 + v2;
		System.out.println("A soma dos valores � " + resultado);
		
		resultado = v1 - v2;
		System.out.println("A subtra��o dos valores � " + resultado);
		
		resultado = v1 * v2;
		System.out.println("A multiplica��o dos valores � " + resultado);
		
		resultado = v1 % v2;
		System.out.println("O resto da divis�o � "+ resultado);
		
		double divis�o;
		divis�o = (double)v1 / v2;
		System.out.println("A divis�o � " + resultado);
		
	}

}
