import java.util.Scanner;
public class Exercico3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double x,y;
	
	System.out.println("Descubra qual quadrante pertence seu ponto\n");
	System.out.print("Digite o valor X com no m�ximo uma casa decimal: ");
	x = teclado.nextDouble();
	System.out.print("Digite o valor de Y: ");
	y = teclado.nextDouble();
	
	if (x == 0 && y == 0) {
		System.out.println("O ponto est� na origem");
    } else if (x == 0) {
        System.out.println("O ponto est� no eixo Y");
    } else if (y == 0) {
        System.out.println("O ponto est� no eixo X");
    } else if (x > 0 && y > 0) {
        System.out.println("O ponto est� no 1� Quadrante");
    } else if (x < 0 && y > 0) {
        System.out.println("O ponto est� no 2� Quadrante");
    } else if (x < 0 && y < 0) {
        System.out.println("O ponto est� no 3� Quadrante");
    } else if (x > 0 && y < 0) {
        System.out.println("O ponto est� no 4� Quadrante");
	}
		
	
	
	}

}
