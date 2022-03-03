package matriz;

public class ejercicio4_matriz {

	public static void main(String[] args) {
		
		// no esta terminado o eso pienso dado que no se ve la pizarra

		int [][] matriz = new int [4][4];

		for (int i = 0; i < matriz.length; i++) {
		
		for (int j = 0; j < matriz[0].length; j++) {
			
			matriz [i] [j] = (int)(Math.random()*100);
			
			
			}
		}
		
		for (int i = 0; i < matriz.length;i++) {
			
			for(int j = 0; j < matriz[0].length; j++) {
				
				
				System.out.println(matriz[i][j]);
				
			}
			
			System.out.println("");
		}
		
	}

}
