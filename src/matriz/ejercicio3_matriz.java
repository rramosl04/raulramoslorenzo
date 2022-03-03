package matriz;

public class ejercicio3_matriz {

	public static void main(String[] args) {
		
		int f = 0;
		
		int [][] vector = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		for (int i = 0; i < vector[0].length;i++) {
			
			for (int j = 0; j < vector[0].length;j++) {
				
				f += vector[i][j];
				
				System.out.printf("fila %d %d ",i,j);
				f=0;
			}
			
			System.out.println("");
		}
		
		
	}

}
