import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int fatorial;
	float conta = 1;
	int contador = 1;
	
	do {
	System.out.print("Digite um número inteiro e positivo para calcular o fatorial: ");
	fatorial = teclado.nextInt();
			if (fatorial < 0){
		System.out.println("Digite um valor válido!");
		}
	}while (fatorial < 0);
	
	while (contador <= fatorial) {
		conta = contador * conta;
		contador++;
	
	}
	System.out.println("\n" + fatorial + "! = " + conta);
	}

}
