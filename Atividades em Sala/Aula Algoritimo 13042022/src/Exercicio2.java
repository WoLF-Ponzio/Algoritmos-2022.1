import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome, g;
	double h,p;

	System.out.println("Calculadora de Peso Idea\n");
	System.out.print("Digite seu nome: ");
	nome = teclado.nextLine();
	System.out.print("Para come�ar, diga seu g�nero: ");
	g = teclado.next();
	if (!g.equals("masculino") && !g.equals("Masculino") && !g.equals("feminino") && !g.equals("Feminino")){
		System.out.println("G�nero Inv�lido!!!");
	}else{
	System.out.print("Digite a sua altura em m�tros: ");
	h = teclado.nextDouble();
		
	if (g.equals("masculino") || g.equals("Masculino")) {
		p = (72.7 * h - 58);
	}else{
		p = (62.1 * h - 44.7);
	}
		System.out.println(nome + ", seu peso ideal �: " + String.format("%.2f", p));
	}
	}
}