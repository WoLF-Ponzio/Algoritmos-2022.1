import java.util.Scanner;
public class Tarefa2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double altura, peso, imc;
	
	System.out.println("Calculadora de IMC");
	System.out.println();
	System.out.print("Digite a sua altura em metros: ");
	altura = teclado.nextDouble();
	System.out.print("Digite o seu peso: ");
	peso = teclado.nextDouble();
	
	imc = peso/(altura*altura);
	
	System.out.println();
	System.out.println("Seu IMC é de: " + String.format("%.2f", imc));
	if (imc >= 25) {
		System.out.println("Seu IMC está acima do peso!");
	} else {
		System.out.println("Seu IMC está saudável!");
	}
	}
}
