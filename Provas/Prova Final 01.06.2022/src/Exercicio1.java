import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double emprestimo, taxa, dia, total;
	
	System.out.println("Calculadora de Juros");
	do {
		System.out.print("\nInsira o valor do empréstimo(digite -1 para terminar): R$ ");
		emprestimo = teclado.nextDouble();
		if (emprestimo == -1){
			System.out.println("Operação terminada");
			break;
		}else{
		System.out.print("Insira a taxa de juros (0 a 1): ");
		taxa = teclado.nextDouble();
		System.out.print("Informe o tempo do empréstimo em dias: ");
		dia = teclado.nextDouble();
		
		total = emprestimo * taxa * (dia/365);
		System.out.println("O valor do juros será de: R$ " + String.format("%.2f", total));
		}	
	}while (emprestimo != (-1));
	
	}

}
