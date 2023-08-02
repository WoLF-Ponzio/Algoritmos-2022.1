import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a,b,c, delta, x1, x2;
		
		//Declaração de variável
		System.out.print("Insira o valor de A: ");
		a = teclado.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = teclado.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = teclado.nextDouble();
		
		System.out.println();
		System.out.println("Executando a fórmula de Bhaskara\n");
		
		//Operação sendo executada
		delta = Math.pow(b, 2) - 4*a*c;
		x1 = (-b + Math.sqrt(delta))/(2*a);
		x2 = (-b - Math.sqrt(delta))/(2*a);
		
		//Saída de dados
		System.out.println("O valor de Delta é: " + String.format("%.2f", delta));
		System.out.println("O valor de X1 é: " + String.format("%.2f", x1));
		System.out.println("O valor de X2 é: " + String.format("%.2f", x2));

	}

}
