import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valor;
	int contador = 1;
	int maior = 0;
	
	// Como estamos trabalhando também com negativos, pela variável ser igual a 0, o maior não será subistítuido
	//Já que 0 é maior do que negativo
	
	System.out.println("Digite 15 valores\n");
	while (contador <= 15) {
		System.out.print("Digite um valor: ");
		valor = teclado.nextInt();
		if (valor > maior || contador == 1) {
			maior = valor;
		}
		contador = contador + 1;
	}
	System.out.println("O maior valor é " + maior);
	}

}
