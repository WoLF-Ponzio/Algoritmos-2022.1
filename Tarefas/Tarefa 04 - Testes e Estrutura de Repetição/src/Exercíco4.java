import java.util.Scanner;
public class Exercíco4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Codificador de número");
		System.out.print("Digite um número inteiro e positivo: ");
		numero = teclado.nextInt();
		if (numero < 0 ) {
			System.out.println("Entrada Inválida");
		}else
			 for (int linha = 0; linha <= numero; linha++){
				 for (int asterisco = 0; asterisco < linha; asterisco++){
					 System.out.print("*");
	                }               
	               	System.out.println("");
	            } 
			
	}

}
