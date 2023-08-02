import java.util.Scanner;
public class Exercico3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double x,y;
	
	System.out.println("Descubra qual quadrante pertence seu ponto\n");
	System.out.print("Digite o valor X com no máximo uma casa decimal: ");
	x = teclado.nextDouble();
	System.out.print("Digite o valor de Y: ");
	y = teclado.nextDouble();
	
	if (x == 0 && y == 0) {
		System.out.println("O ponto está na origem");
    } else if (x == 0) {
        System.out.println("O ponto está no eixo Y");
    } else if (y == 0) {
        System.out.println("O ponto está no eixo X");
    } else if (x > 0 && y > 0) {
        System.out.println("O ponto está no 1º Quadrante");
    } else if (x < 0 && y > 0) {
        System.out.println("O ponto está no 2º Quadrante");
    } else if (x < 0 && y < 0) {
        System.out.println("O ponto está no 3º Quadrante");
    } else if (x > 0 && y < 0) {
        System.out.println("O ponto está no 4º Quadrante");
	}
		
	
	
	}

}
