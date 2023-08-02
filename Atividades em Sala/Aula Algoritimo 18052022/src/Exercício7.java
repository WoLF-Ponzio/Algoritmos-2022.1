// Escreva um programa que leia os dados de n pasciente. Para cada um deles, leia o nome, altura, peso e imprima o imc.

import java.util.Scanner;
public class Exercício7 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome, genero;
	int t;
	double altura, peso, imc;
	
	System.out.print("Informe o total de pascientes: ");
	t = teclado.nextInt();
	
	for (int contador = 1; contador <= t; contador++) {
	
	System.out.println();
	teclado.nextLine();
	System.out.print("Insira o nome do pasciente:");
	nome = teclado.nextLine();
	System.out.print("Digite seu gênero:");
	genero = teclado.nextLine();
	genero = genero.toLowerCase();
	System.out.print("Insira a sua altura em m: ");
	altura = teclado.nextDouble();
	System.out.print("Insira seu peso em quilos: ");
	peso = teclado.nextDouble();
	imc = peso/(altura*altura);
	
	if(imc>30) {
		System.out.println(nome + ", " + genero + ", de " + altura + " cm, tem seu IMC de: " + String.format("%.2f", imc) + " que está acima do peso!" );
	}else {
		System.out.println(nome + ", " + genero + ", de " + altura + " cm, tem seu IMC de: " + String.format("%.2f", imc) + " que está normal!");
	}
	
	}

	}

}
