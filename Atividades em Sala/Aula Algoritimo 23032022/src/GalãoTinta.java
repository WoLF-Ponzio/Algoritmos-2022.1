import java.util.Scanner;
public class Gal�oTinta {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Double r,h,a,latas,valor;
	
	System.out.println("Calculadora de latas de tinta\n");
	System.out.println("Bem Vindo, Jo�o!\n");
	System.out.print("Incira o raio do tanque: ");
	r = teclado.nextDouble();
	System.out.println();
	System.out.print("Incira o valor da altura: ");
	h = teclado.nextDouble();
	System.out.println();
	
	a = 2 * Math.PI * r * (r + h);
	System.out.println("O valo da �rea �: " + a);
	
	latas = a/3/5;
	valor = latas * 220;
	
	System.out.println("Ser�o necess�rias " + latas + " latas de tinta");
	System.out.println("O total delas ser�: R$" + valor);
	
	
	}

}
