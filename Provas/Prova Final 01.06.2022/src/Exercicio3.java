import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double far,min,max;
	
	System.out.println("Conversor de temperatura");
	System.out.print("Insira a temperatura máxima: ");
	max = teclado.nextInt();
	System.out.print("Insira a temperatura mínima: ");
	min = teclado.nextInt();
	
	do {
		far = (min * 9/5) + 32;
		System.out.println(min + "ºC ----> " + far + "ºF");
		min = min + 1;
	}while(min <= max);
	
	
	}

}
