import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int pontos, contador = 1;
	double x,x1 = 0,y1 = 0,y,d,m = 0;
	
	System.out.println("Calculadora de dist�ncia no ponto cartesiano");
	System.out.print("\nInsira a quantidade de pontos que ser�o informados: ");
	pontos = teclado.nextInt();
	
	do {
		System.out.println("\nPonto n�mero " + contador);
		System.out.print("Informe o ponto x: ");
		x = teclado.nextDouble();
		System.out.print("Informe o ponto y: ");
		y = teclado.nextDouble();
			d = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y-0), 2));
		System.out.println("A dist�ncia at� a origen: " + String.format("%.4f",d));
		contador++;
		if(d > m) {
			m = d;
			x1 = x;
			y1 = y;
		}
	 }while (contador <= pontos);
		System.out.println("\nO ponto mais distante �: " + x1 + " , " + y1);

		
		

		
	
	
	}

}
