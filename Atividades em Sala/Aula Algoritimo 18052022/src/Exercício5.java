import java.util.Scanner;
public class Exerc�cio5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	int contador = 0;
	
	do {
		System.out.print("Insira um n�mero inteiro e positivo: ");
	numero = teclado.nextInt();
	if (numero <= 0)
		System.out.println("\nn�mero n�o positivo");
	}while (numero <= 0);
	
	for (int count = 1; count <= numero; count++) {
		if(numero % count == 0)
			contador++;
	}
	if(contador == 2){
		System.out.println("O n�mero " + numero + " � primo");
	}else{
		System.out.println("O n�mero " + numero + " n�o � primo");
	}

	}

}
