import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	
	double n1,n2,n3,m;
	System.out.print("Incira a primeira nota: ");
	n1 = teclado.nextDouble();
	System.out.print("Incira a segunda nota: ");
	n2 = teclado.nextDouble();
	System.out.print("Incira a terceira nota: ");
	n3 = teclado.nextDouble();
	System.out.println();
	
	m = (n1+n2+n3)/3;
		System.out.println("Sua média final é: " + String.format("%.2f", m));
	if(m >= 7) {
		System.out.println("Você foi aprovado!!!");
	} else {
		System.out.println("Você ficou de Dependencia!!!");
	}
		
	}

}
