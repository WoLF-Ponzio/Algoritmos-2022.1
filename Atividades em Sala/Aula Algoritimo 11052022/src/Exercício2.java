import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valor;
	int contador = 1;
	int maior = 0;
	
	// Como estamos trabalhando tamb�m com negativos, pela vari�vel ser igual a 0, o maior n�o ser� subist�tuido
	//J� que 0 � maior do que negativo
	
	System.out.println("Digite 15 valores\n");
	while (contador <= 15) {
		System.out.print("Digite um valor: ");
		valor = teclado.nextInt();
		if (valor > maior || contador == 1) {
			maior = valor;
		}
		contador = contador + 1;
	}
	System.out.println("O maior valor � " + maior);
	}

}
