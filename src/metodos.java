import java.util.Scanner;

public class metodos {

	

		public static Scanner TECLADO;
		
		public static void  main(String[]ARGUMENTOS) {
		
			
			TECLADO = new Scanner(System.in);
			int NUMERO_01,NUMERO_02,OP_SUMA,OP_RESTA,OP_MULTIPLICACION;
			float OP_DIVISION;
			NUMERO_01 = LEER_NUMERO("NUMERO_01");
			NUMERO_02 = LEER_NUMERO("NUMERO_02");
			OP_SUMA = SUMA(NUMERO_01,NUMERO_02);
			OP_RESTA = RESTA(NUMERO_01,NUMERO_02);
			OP_MULTIPLICACION = MULTIPLICACION(NUMERO_01,NUMERO_02);
			OP_DIVISION = DIVISION(NUMERO_01,NUMERO_02);

			IMPRIMIR_RESULTADOS(OP_SUMA,OP_RESTA,OP_MULTIPLICACION,OP_DIVISION);
			}

			public static int LEER_NUMERO(String NOMBRE_NUMERO)
			{
			int NUMERO;
			System.out.print("INDIQUE EL " + NOMBRE_NUMERO + " : ");
			NUMERO = TECLADO.nextInt();
			return NUMERO;
			}

			public static int SUMA(int NUM_01, int NUM_02)
			{
			int SUMA;
			SUMA = NUM_01 + NUM_02;

			
			return SUMA;
			}

			public static int RESTA(int NUM_01, int NUM_02)
			{
			int RESTA;
			RESTA = NUM_01 - NUM_02;
			return RESTA;
			}

			public static int MULTIPLICACION(int NUM_01, int NUM_02)
			{
			int MULTIPLICACION;
			MULTIPLICACION = NUM_01 * NUM_02;
			return MULTIPLICACION;
			}

			public static float DIVISION(int NUM_01, int NUM_02)
			{
			Float DIVISION;
			DIVISION = (float)(NUM_01/NUM_02);
			return DIVISION;
			}

			public static void IMPRIMIR_RESULTADOS(int S,int R,int M,float D)
			{
			System.out.println("LOS RESUTLADOS SON : \n");
			System.out.println("SUMA : "+ S);
			System.out.println("RESTA : "+ R);
			System.out.println("MULTIPLICACION : "+ M);
			System.out.println("DIVISION : "+ D);
			}
		
			
}
