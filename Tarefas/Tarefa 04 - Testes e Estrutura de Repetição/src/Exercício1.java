import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int candidato1 = 0,candidato2 = 0,candidato3 = 0;
	int branco = 0,nulo = 0,contador = 0, total;
	
	System.out.println("URNA ELETRÔNICA");
	System.out.println("Para terminar a operação digite -2");
	do {
		System.out.println("\nEscolha seu candidato");
		System.out.println("Candidato A = 1 \nCandidato B = 2\nCandidato C = 3\nBranco = 0 \nNulo = -1");
		System.out.print("Digite o número do seu candidato: ");
		contador = teclado.nextInt();
		if(contador == -1) {
			nulo++;
			System.out.println("");
		}else if (contador == 0) {
			branco++;
		}else if (contador == 1) {
			candidato1++;
		}else if(contador == 2) {
			candidato2++;
		}else if(contador == 3) {
			candidato3++;
		}else if (contador == -2) {
				break;
		}else
			System.out.println("Entrada inválida!!!");
		System.out.println("Voto realizado com sucesso!!!");
	}while(contador != -2);
	
	total = candidato1 +candidato2 +candidato3 + branco + nulo;
	System.out.println("\n Apuração terminada!");
	if(candidato1 > candidato2 && candidato1 > candidato3) {
		System.out.println("O candidato 1 foi o vencendor!!!\n");
		
	}else if(candidato2 > candidato3) {
		System.out.println("O candidato 2 foi o vencendor!!!\n");
	}else
		System.out.println("O candidato 3 foi o vencendor!!!\n");
	System.out.println("O total de votos foram: " + total);
		System.out.println("Candidato 1 ---> " + candidato1);
		System.out.println("Candidato 2 ---> " + candidato2);
		System.out.println("Candidato 3 ---> " + candidato3);
		System.out.println("Brancos ---> " + branco);
		System.out.println("Nulo ---> " + nulo);
	}

}
