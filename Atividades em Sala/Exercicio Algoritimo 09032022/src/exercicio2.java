import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x,y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de 'X': ");
		x = teclado.nextDouble();
		
		
		y = Math.pow(x, 1.0/3) + Math.pow(x + 2, 3.0/5);
		
		System.out.println("O valor é: " + y);
		
		
		

	}

}
