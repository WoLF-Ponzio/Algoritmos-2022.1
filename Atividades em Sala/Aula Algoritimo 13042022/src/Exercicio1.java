import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome;
	double h,p,p2;
	int g;
	
	System.out.println("Calculadora de Peso Idea\n");
	System.out.println("Digite seu nome: ");
	nome = teclado.nextLine();
	System.out.print("Para come�ar, diga seu g�nero. Digite 1 caso seja homem ou 2 caso seja mulher: ");
	g = teclado.nextInt();
	if (g > 3 || g < 0) {
		System.out.println("G�nero Inv�lido!!!");
	}else{
	System.out.print("Digite a sua altura em m�tros: ");
	h = teclado.nextDouble();
		
	if (g == 1) {
		p = (72.7 * h - 58);
	}else{
		p = (62.1 * h - 44.7);
	}
		System.out.println(nome + ", seu peso ideal �: " + p);
	}
	}
}
	
	

	


