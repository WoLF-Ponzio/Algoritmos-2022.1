import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	Double largura, altura, perimetro, area;
	
	System.out.print("Adicione a largura do ret�ngulo ");
	largura = teclado.nextDouble();
	System.out.print("Adicione a altura do ret�ngulo ");
	altura = teclado.nextDouble();
	
	area = largura * altura;
	perimetro = (largura*2) + (altura*2);
	
	System.out.println("A �rea ser�: " + String.format("%.2f", area));
	System.out.println("O perimetro ser�: " + String.format("%.2f", perimetro));
	}

}
