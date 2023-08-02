import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
    int soma;
    String divisores;
    
    System.out.println("Listagem dos números perfeitos entre 1 e 1.000.000");
    for (int numero = 1; numero <= 1000000; numero++) {
      soma = 0;
      divisores = ""; 
 
      for (int divisor = 1; divisor <= (numero/2); divisor++) {
        if ((numero % divisor) == 0) {
           soma = soma + divisor;  
        }
      }
      if (numero == soma)
         System.out.print(numero + "\n");
    }

	}

}
