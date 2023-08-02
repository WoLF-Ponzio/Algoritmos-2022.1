import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double m,c,i,t;
	
	System.out.println("Simulação Financeira\n");
	System.out.println("Para a simulação, serão necessários o valor que será investido, juros e o tempo");
	System.out.print("Insira o valor inicial para a aplicação: ");
	c = teclado.nextDouble();
	System.out.print("Agora insira a taxa de juros: ");
	i = teclado.nextDouble()/100;
	System.out.print("Por fim, insira o tempo em meses desejado para o investimento: ");
	t = teclado.nextDouble();
	m = c * Math.pow((1+i),t);
	System.out.println("Após " + t + " meses, o senhor terá um total de R$ " + String.format("%.2f", m));
	
	}

}
