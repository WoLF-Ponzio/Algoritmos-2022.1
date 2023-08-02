import java.util.Scanner;
public class Tarefa3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double venda, salario;
	
	System.out.println("Calculadora de Salário");
	System.out.println();
	System.out.print("Digite o valor total das vendas: ");
	venda = teclado.nextDouble();
	
	if (venda > 25000) {
		salario = venda * 0.1885;
	}else {
		salario = venda * 0.175;
	}
	
	System.out.println("Seu salário é de : R$ " + salario);
	}

}
