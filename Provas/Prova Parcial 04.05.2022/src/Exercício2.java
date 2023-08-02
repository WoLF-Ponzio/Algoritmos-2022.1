import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a,b,c,n,t;
	
	System.out.println("Apuração dos votos");
	System.out.print("Insira a quantidade de votos da chapa A: ");
	a = teclado.nextInt();
	System.out.print("Insira a quantidade de votos da chapa B: ");
	b = teclado.nextInt();
	System.out.print("Insira a quantidade de votos da chapa C: ");
	c = teclado.nextInt();
	System.out.print("Insira a quantidade de votos em branco: ");
	n = teclado.nextInt();
	System.out.println();
	//Total de votos
	t = a+b+c+n;
	System.out.println("O total de votos foram: " + t);
	if (a > b && a > c) {
		System.out.println("A chapa A foi a vencedora!");
		if (b > c) {
			System.out.println("A chapa C ficou em último lugar!");
		}else {
			System.out.println("A chapa B ficou em último lugar!");
		}
	}else if (b > a && b > c) {
		System.out.println("A chapa B foi a vencedora!");
		if (a > c) {
			System.out.println("A chapa C ficou em último lugar!");
		}else {
			System.out.println("A chapa A ficou em último lugar");
		}
	}else {
		System.out.println("A chapa C foi a vencedora!");
		if (a > b) {
			System.out.println("A chapa B ficou em último lugar!");
		}else {
			System.out.println("A chapa A ficou em último lugar!");
		}
	}
	
	}

}
