import java.util.Scanner;
public class Exerc�cio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero, resposta; 
	int contador = 0;
	
	System.out.println("Digite um n�mero e veja sua tabuada");
	do {
	System.out.print("Digite um n�mero: ");
	numero = teclado.nextInt();
	while (contador <= 10) {
		System.out.println(contador + "� n�meor da t�buada: " + numero*contador);
		contador = contador + 1;
			}
	
	System.out.print("\nVoc� deseja fazer outra tabuada? 1 para sim, 0 para n�o: ");
	resposta = teclado.nextInt();
	contador = 0;
	System.out.println();
		}while(resposta == 1);
	}

}
