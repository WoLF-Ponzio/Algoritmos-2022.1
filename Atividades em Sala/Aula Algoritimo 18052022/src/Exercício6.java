import java.util.Scanner;
public class Exercício6 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n;
	double y = 0;
	
	System.out.print("Insira um número inteiro: ");
	n = teclado.nextInt();
	
	for (int count = 1; count <= n; count++) {
		if(count % 2 == 0) {
			y = y - 1.0/count;
		}else {
			y = y + 1.0/count;
		}
	}
	System.out.println("O resultado da conta é: " + y);
	}

}
