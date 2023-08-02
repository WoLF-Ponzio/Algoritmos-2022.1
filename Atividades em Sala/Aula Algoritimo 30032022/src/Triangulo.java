import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double l1,l2,l3;
	
	System.out.print("Incira o valor do primeiro lado do triangulo: ");
	l1 = teclado.nextDouble();
	System.out.print("Incira o valor do segundo lado do triangulo: ");
	l2 = teclado.nextDouble();
	System.out.print("Incira o valor do terceiro lado do triangulo: ");
	l3 = teclado.nextDouble();
	
	if (l1<l2+l3 && l2<l1+l3 && l3<l1+l2) {
		System.out.println("É um triangulo válido!");
	}else {
		System.out.println("Não é um triangulo válido");
	}

	}

}
