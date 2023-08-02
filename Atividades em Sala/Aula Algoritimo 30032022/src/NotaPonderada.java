import java.util.Scanner;
public class NotaPonderada {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double prova1,prova2;
	double trabalho1,trabalho2, media;
	
	System.out.print("Incira a nota da primeira prova: ");
	prova1 = teclado.nextDouble();
	System.out.print("Incira a nota da segunda prova: ");
	prova2 = teclado.nextDouble();
	System.out.print("Incira a nota do primeiro trabalho: ");
	trabalho1 = teclado.nextDouble();
	System.out.print("Incira a nota do primeiro trabalho: ");
	trabalho2 = teclado.nextDouble();
	System.out.print("");

	
	media = ((prova1 + prova2) / 2) * 0.7 + ((trabalho1 +trabalho2)/2) * 0.3; 
	System.out.println("Sua média das provas com trabalho foi: " + String.format("%.2f", media));
	if (media >= 7) {
		System.out.println("Você está aprovado!!!");
	}else{
		System.out.println("Você está de depêndencia!!!");
	}
	
	}

}
