import java.util.Scanner;
public class Exerc�cio4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a,b,c;
	int n;
	
	do {
		
	
	System.out.println("Digite valores e descubra o tri�ngulo");
	do { 
	System.out.print("Insira o primeiro valor: ");
	a = teclado.nextDouble();
	System.out.print("Insira o segundo valor: ");
	b = teclado.nextDouble();
	System.out.print("Insira o terceiro valor: ");
	c = teclado.nextDouble();
	
	if (a > b+c || b > a+c ||c > a+b)
		System.out.println("Os n�meros digitados n�o geram um tri�ngulo\n");
	}while (a > b+c || b > a+c ||c > a+b);
	
	if (a == b && b == c) {
		System.out.println("O tri�ngulo � equilatero");
	}else if (a == b || b == c || c == a) {
		System.out.println("O tri�ngulo � dois lados iguais");
	}else {
		System.out.println("O tri�ngulo � diferenciado");
	}
	System.out.println("Deseja testar mais um tri�ngulo? 1 para sim e 2 para n�o");
	n = teclado.nextInt();
	}while(n == 1);
	}
}
