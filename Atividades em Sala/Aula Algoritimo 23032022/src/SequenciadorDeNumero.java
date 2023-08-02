import java.util.Scanner;
public class SequenciadorDeNumero {

	public static void main(String[] args) {
		
	java.util.Scanner teclado = new Scanner(System.in);
	
	int numero, sucessor;
	
	System.out.print("Digite um valor entre 0 a 60: ");
	numero = teclado.nextInt();
	sucessor = (numero + 1 ) % 61;
	System.out.println("O sucessor de " + numero + " é: " + sucessor);

	}

}
