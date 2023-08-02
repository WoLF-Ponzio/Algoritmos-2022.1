import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	Double x,y,u,w,q,z;
	System.out.print("Digite o valor de 'X': ");
	x = teclado.nextDouble();
	System.out.print("Agora digite o valor de 'Y': ");
	y =  teclado.nextDouble();
	System.out.print("Agora digite o valor de 'U': ");
	u = teclado.nextDouble();
	System.out.print("Agora digite o valor de 'W': ");
	w = teclado.nextDouble();
	System.out.print("Por último, digite o valor de 'Q': ");
	q = teclado.nextDouble();
	
	System.out.println();
	System.out.println("Numeros confirmados!");
	System.out.println();
	System.out.println("Executando a operação");
	z = (x + y) / (u + w / q);
	System.out.println();
	System.out.println("O valor da operação é: " + z);
	
	
	}

}
