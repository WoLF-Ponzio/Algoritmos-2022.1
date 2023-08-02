import java.util.Scanner;
public class Tarefa1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int aula;
	double valor,sb,ha,dsr,salario;
	
	System.out.println("Calculo de salário");
	System.out.println();
	System.out.print("Digite o valor da hora aula: ");
	valor = teclado.nextDouble();
	System.out.print("Digite a quantidade de aulas semanais: ");
	aula = teclado.nextInt();
	
	sb = aula * 4.5 * valor;
	ha = sb * 0.05;
	dsr = (sb + ha)/6;
	salario = sb + ha + dsr;
	
	System.out.println("O valor do salário é de: R$ " + String.format("%.2f", salario) );
		
	}

}
