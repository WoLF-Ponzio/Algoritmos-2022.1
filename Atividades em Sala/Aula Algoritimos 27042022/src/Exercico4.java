import java.util.Scanner;
public class Exercico4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int m,c,d,n;
	
	System.out.println("Descubra se o n�mero � pal�ndromo\n");
	System.out.println("Incira um n�mero inteiro positivo de quatro casas");
	System.out.print("Insira a casa do milhar: ");
	m = teclado.nextInt();
	System.out.print("Insira a casa da centena: ");
	c = teclado.nextInt();
	System.out.print("Insira a casa da dezena: ");
	d = teclado.nextInt();
	System.out.print("Insira a primeira casa: ");
	n = teclado.nextInt();
	System.out.println();
	
	if (m<0 || c<0 || d<0 ||n<0) {
		System.out.println("N�mero negativo inv�lido");
	}else{
		System.out.println("N�mero v�lido!\n");
		if (m == n && c == d){
			System.out.println("O seu n�mero " + ((m*1000)+(c*100) +(d*10)+n) + " � pal�ndromo");
		}else {
			System.out.println("O seu n�mero " + ((m*1000)+(c*100) +(d*10)+n) + " n�o � pal�ndromo");
		}
	}
	}

}
