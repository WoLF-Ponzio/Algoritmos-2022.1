import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,x;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = teclado.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = teclado.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = teclado.nextDouble();
		
		x = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a ;
		System.out.println("O valor de x é: "+ x);
		
				
		
	}

}
