import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        double salario;
        
        System.out.println("Calculadora de Imposto");
        System.out.print("Qual o seu sal�rio? : R$ ");
        salario = teclado.nextDouble();
       
        if (salario >= 0 && salario <= 2000) {
        	System.out.println("Voc� est� isento");
        	
        } else if (salario > 2000 && salario <= 3000) {
        	System.out.println ("Voc� pagar� R$ " +((salario - 2000) * 0.08) + " de imposto");
        	
        } else if (salario > 3000 && salario <= 4500) {
        	System.out.println ("Voc� pagar� R$ " + ((salario - 3000)  * 0.18 + 80) + " de imposto");
        	
        } else {
        	System.out.println("Voc� pagar� R$ " + ((salario - 4500) * 0.28 + 350 )+ " de imposto");
        }
	}
	
}