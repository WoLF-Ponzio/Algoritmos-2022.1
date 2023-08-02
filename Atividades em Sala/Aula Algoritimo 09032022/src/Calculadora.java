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
		System.out.println("A soma dos valores é " + resultado);
		
		resultado = v1 - v2;
		System.out.println("A subtração dos valores é " + resultado);
		
		resultado = v1 * v2;
		System.out.println("A multiplicação dos valores é " + resultado);
		
		resultado = v1 % v2;
		System.out.println("O resto da divisão é "+ resultado);
		
		double divisão;
		divisão = (double)v1 / v2;
		System.out.println("A divisão é " + resultado);
		
	}

}
