import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int cont, quantidade;
	cont = 2;

	System.out.print("Insira a quantidade de números parers que deseja ser impresso: ");
	quantidade = teclado.nextInt();
		
	while (cont <= quantidade * 2) {
			System.out.println(cont);
			cont = cont + 2;

	    }
	 }

}
