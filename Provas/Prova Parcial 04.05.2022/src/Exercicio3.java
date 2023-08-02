import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double fabrica, total;
	
	System.out.println("Calculadora do valor de um carro\n");
	System.out.print("Incira o custo de fábrica do veículo: ");
	fabrica = teclado.nextDouble();
	
	if (fabrica <= 12000) {
		total = fabrica + fabrica * 0.05;

	}else if (fabrica > 12000 && fabrica <= 25000) {
		total = fabrica + (fabrica * 0.1) + (fabrica * 0.15);
	}else {
		total = fabrica + (fabrica * 0.15) + (fabrica * 0.20);
	}
	System.out.println("O valor do carro será: R$ " + total);

	}

}
