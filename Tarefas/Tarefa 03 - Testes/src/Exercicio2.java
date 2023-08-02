import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int A,B,C,D;
	
	System.out.print("Digite o Valor de A: ");
	A = teclado.nextInt();
	System.out.print("Digite o Valor de B: ");
	B = teclado.nextInt();
	System.out.print("Digite o Valor de C: ");
	C = teclado.nextInt();
	System.out.print("Digite o Valor de D: ");
	D = teclado.nextInt();
	
	if (B>C && D>A && (C+D)>(A+B) && C>= 0 && D>= 0 && A%2 == 0){
		System.out.println("Valores Aceitos");
		
	}else {
		System.out.println("Valores não Aceitos");
	}



	

	}

}
