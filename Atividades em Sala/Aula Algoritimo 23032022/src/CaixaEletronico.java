import java.util.Scanner;
public class CaixaEletronico {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int valor, q100,q50,q20,q10,q5,q1;
	
	System.out.print("Digite o valor desejado para o saque: ");
	valor = teclado.nextInt();
	System.out.println();
	
	q100 = valor/100;
	q50 = (valor%100)/50;
	q20 = ((valor%100)%50)/20;
	q10 = (((valor%100)%50)%20)/10;
	q5 = ((((valor%100)%50)%20)%10)/5;
	q1 = (((((valor%100)%50)%20)%10)%5)/1;
	
	System.out.println("No total, serão:\n"); 
	System.out.println(q100 + " notas de 100, ");
	System.out.println(q50 + " notas de 50, ");
	System.out.println(q20 + " notas de 20, " );
	System.out.println(q10 + " notas de 10, " );
	System.out.println(q5 + " notas de 5 ");
	System.out.println(q1 + " notas de 1");
//
	}

}
