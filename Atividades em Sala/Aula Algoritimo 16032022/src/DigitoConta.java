import java.util.Scanner;
public class DigitoConta {

	public static void main(String[] args) {
	int conta, soma, d1,d2,d3,numero,reverso,div1,div2,div3,div4;
	int mult, digito;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Calculadora de dígito bancário\n");
	System.out.print("Insira o primeiro número da sua conta: ");
	d1 = teclado.nextInt();
	System.out.print("Insira o segundo número da sua conta: ");
	d2 = teclado.nextInt();
	System.out.print("Insira o terceiro número da sua conta: ");
	d3 = teclado.nextInt();
	
	numero = (d1*100)+(d2*10)+d3;
	reverso = (d3*100)+(d2*10)+d1;
	
	//Fazer a soma do número com seu inverso, multiplicar cada  e pegar o último número
	
	soma = numero + reverso;
	
	System.out.println(soma);
	
	div1 = soma/100;
			System.out.println(div1);
	div2 = soma%10;
	div3 = soma%100; 
	div4 = div3/10;
			System.out.println(div4);
			System.out.println(div2);
	
	mult = div1 * 3 + div4*2 + div2*1;
	System.out.println(mult);
	digito = mult%10;
	System.out.println(digito);
			
	}

}
