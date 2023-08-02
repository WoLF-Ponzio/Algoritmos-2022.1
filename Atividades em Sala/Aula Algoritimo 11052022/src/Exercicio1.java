import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int a,b;
	
	System.out.println("Sequênciador de Números POSITIVOS");
	System.out.print("Insira o primeiro valor positivo: ");
	a = teclado.nextInt();
	System.out.print("Insira o segundo valor positivo: ");
	b = teclado.nextInt();
	
	if (a>b) {
           do {  
              System.out.println(b);  
              b++;  
           }while(b <= a);  
	}else {
		do {
			System.out.println(a);
			a++;
		}while(a<=b);
	}
	}

}
