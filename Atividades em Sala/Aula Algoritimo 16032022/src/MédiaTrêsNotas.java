import java.util.Scanner;
public class M�diaTr�sNotas {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	float n1,n2,n3,mf;
	
	System.out.print("Insira o valor da primeira nota: ");
	n1 = teclado.nextFloat();
	System.out.print("Insira o valor da segunda nota: ");
	n2 = teclado.nextFloat();
	System.out.print("insira o valor da terceira nota: ");
	n3 = teclado.nextFloat();
	
	mf = (n1+n2+n3)/3;
	System.out.print("Sua m�dia final �: " + mf);
	System.out.println();
	//Espa�o em branco
	if (mf >= 7) {
		System.out.println("Parab�ns!!! Voc� passou de semestre!");	
	} else {
		System.out.println("Infelismete voc� ficou de DP T-T");
	}
	}

}
