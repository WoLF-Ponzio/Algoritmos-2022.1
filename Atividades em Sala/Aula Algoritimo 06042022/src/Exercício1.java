import java.util.Scanner;
public class Exerc�cio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int dia;
	double valor;
	
	System.out.print("Informe o n�mero de dias que ficar� no hotel: ");
	dia = teclado.nextInt();	
	
	if(dia > 15) {
		valor = (150 + 15.50) * dia;
	}else if(dia == 15) {
		valor = (150 + 36) * dia;
	}else {
		valor = (150 + 58) * dia;
	}
	System.out.println("O total da sua reserva ficou: R$ " + valor);
	
	
	
	}
				
}
	
