import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome;
	int nascimento, ano, tempo, idade;
	
	System.out.println("Validador de aposentadoria");
	System.out.print("Insira seu nome: ");
	nome = teclado.nextLine();
	System.out.print("Insira seu ano de nascimento: ");
	nascimento = teclado.nextInt();
	System.out.print("Insira o ano de ingresso na empresa: ");
	ano = teclado.nextInt();
	
	tempo = 2022 - ano;
	idade = 2022 - nascimento;
	
	if (idade >= 65 || idade>=60 && tempo >= 25 || tempo > 30) {
		System.out.println(nome + ",");
		System.out.println("De " + idade + " anos, já trabalhou " + tempo + " anos, requere aposentadoria!");
	}else { 
		System.out.println(nome + ",");
		System.out.println("De " + idade + " anos, já trabalhou " + tempo + " anos, não requer aposentadoria");
	}

		
	}

}
