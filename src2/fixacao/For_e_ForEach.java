package fixacao;

public class For_e_ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Gabriel", "Leonardo", "Roseli", "Gilmar"};
		
		for(int i=0; i<vect.length; i++) {// FOR
			System.out.println(vect[i]);  //percorra o vetor vect desde sua posição 0
		}								  //ate i ser menor que o vetor
										  //some 1 a cada for realizado
		
		for(String obj : vect) {		  // FOR EACH
			System.out.println(obj);	  //percorra todos os campos do vetor
		}								  //nomei vect de obj        MESMA COISA DE PHP
	}

}
