import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	int contador = 0;
	
	do {
		System.out.print("Insira um número inteiro e positivo: ");
	numero = teclado.nextInt();
	if (numero <= 0)
		System.out.println("\nnúmero não positivo");
	}while (numero <= 0);
	
	for (int count = 1; count <= numero; count++) {
		if(numero % count == 0)
			contador++;
	}
	if(contador == 2){
		System.out.println("O número " + numero + " é primo");
	}else{
		System.out.println("O número " + numero + " não é primo");
	}

	}

}
