import javax.swing.text.DefaultEditorKit.InsertContentAction;

public class ArquivoClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1,v2;
		int mais,menos,multiplicar;
		float dividir, resto; 
		
		
		v1	= 23;
		v2 = 12;
		
		mais = v1 + v2;
		menos = v1 - v2;
		multiplicar = v1 * v2;
		dividir = v1 / v2;
		resto = v1 % v2;
		
		System.out.println("O valor da soma �:" + mais);
		System.out.println("O valor da subtra��o �:" + menos);
		System.out.println("O valor da multiplica��o �:" + multiplicar);
		System.out.println("O valor da divis�o �:" + dividir); 
		System.out.println("O resto da divis�o �:" + resto);
		
	}

}
