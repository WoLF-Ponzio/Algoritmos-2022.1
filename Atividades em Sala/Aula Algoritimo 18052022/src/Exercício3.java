import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double t = 0;
	double p;
	int q, pag;
	String alternativa;
	
	System.out.println("Caixa registradora");
	do {
		System.out.print("Insira a quantidade do produto comprado: ");
		q = teclado.nextInt();
		System.out.print("Insira o preço do produto: R$ ");
		p = teclado.nextDouble();
		t = t + q * p;
		
		System.out.print("Deseja inserir mais um produto? s/n? ");
		alternativa = teclado.next();
		alternativa = alternativa.toLowerCase();
	}while (alternativa.equals("s"));
	
	System.out.println("Deseja pagar à vista ou parcelado em 2x? 1 para à vista 2 para 2x");
	pag = teclado.nextInt();
	if (pag == 1) {
	t = t * 0.9;
		System.out.println("O valor total da compra é R$: " + String.format("%.2f", t));
	}else{
		t = t * 1.155;
		System.out.println("O valor total da compra é R$: " + String.format("%.2f", t));
		System.out.println("Ficando duas parcelas de R$: " + String.format("%.2f", t/2));
	}
	

	}

}
