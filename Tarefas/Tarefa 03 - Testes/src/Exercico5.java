import java.util.Scanner;
public class Exercico5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String def,def2,def3;
	
	System.out.println("Descubra um animal, através da classificação");
	System.out.print("Vertebrado ou Invertebrado?: ");
	def = teclado.next();
	def = def.toLowerCase();
	if (def.equals("vertebrado")){
		System.out.print("ave ou mamifero?: ");
		def2 = teclado.next();
		def2 = def2.toLowerCase();
		if (def2. equals("ave")) {
		System.out.println("carnivoro ou onivoro?: ");
		def3 = teclado.next();
		def3 = def3.toLowerCase();
		if (def3.equals("carnivoro")) {
			System.out.println("Seu animal é uma Águia!");
		}else 
			System.out.println("Seu animal é uma Pomba!");
		//--------------------------------------------------
		
		}else{
			System.out.println("onivoro ou herbivoro?: ");
		def3 = teclado.next();
		def3 = def3.toLowerCase();
		if (def3.equals("onivoro")) {
			System.out.println("Seu animal é o homem!");
		}else 
			System.out.println("Seu animal é uma vaca!");
		}
		//-----------------------------------------------
		
	}else {
		System.out.println("Inseto ou anelidio?: ");
		def2 = teclado.next();
		def2 = def2.toLowerCase();
		if (def2.equals("inseto")) {
			System.out.println("hematofago ou herbivoro?: ");
			def3 = teclado.next();
			def3 = def3.toLowerCase();
			if (def3.equals("hematofago")) {
				System.out.println("Seu animal é uma pulga!");
			}else
				System.out.println("Seu animal é uma lagarta!");
		//------------------------------------------------------
			
		}else{
			System.out.println("hematofago ou onivoro?");
			def3 = teclado.next();
			def3 = def3.toLowerCase();
			if (def3.equals("hematofago")) {
				System.out.println("Seu animal é uma sanguessuga!");
			}else
				System.out.println("Seu animal é uma minhoca!");
		}
	}
		
	}

}
