import java.util.Scanner;
public class LeitorDeBinario {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int binario, div1,div2,div3,div4,numero;
	
	System.out.println("Leitor de número binário\n");
	System.out.print("Incira um número binário de até 4 dígitos: ");
	binario = teclado.nextInt();
	
	div1 = binario/1000;
	div2 = (binario%1000)/100;
	div3 = (binario%100)/10;
	div4 = (binario%10);
	
	System.out.println();
	numero = (int) (div1*Math.pow(2, 3) + div2*Math.pow(2, 2) + div3*Math.pow(2, 1) + div4*Math.pow(2, 0));
	System.out.println("Seu número é: " + numero);
	
	

	}

}
