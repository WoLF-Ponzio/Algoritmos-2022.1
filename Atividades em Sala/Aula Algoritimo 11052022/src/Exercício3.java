import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero, resposta; 
	int contador = 0;
	
	System.out.println("Digite um número e veja sua tabuada");
	do {
	System.out.print("Digite um número: ");
	numero = teclado.nextInt();
	while (contador <= 10) {
		System.out.println(contador + "º númeor da tábuada: " + numero*contador);
		contador = contador + 1;
			}
	
	System.out.print("\nVocê deseja fazer outra tabuada? 1 para sim, 0 para não: ");
	resposta = teclado.nextInt();
	contador = 0;
	System.out.println();
		}while(resposta == 1);
	}

}
