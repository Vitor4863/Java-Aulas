package teste;

public class Main {

	public static void main(String[] args) {
		int y , x;
		int a,g;
		double resultado;
		double w;
		double O ;
		int R;
		double b, B, H , area;
		
		double P,N,FR;
		//----------------------------Multiplica��o--------------------------------------------------------------------------
		x = 5;
		y=2*x;
		w=2*x;
		//-----------------------------Divis�o-------------------------------------------------------------------------------
		a=5;
		g=2;
		O=5.0;
		R= (int)O;
		//----------------------------Area ----------------------------------------------------------------------------------
		b= 6.0;
		B= 8.0;
		H = 5.0;
	    //----------------------------Estatistica----------------------------------------------------------------------------
		P= 13400;	 
		N=149200;
		
		
		//------------------------------Escrita-Multiplica��o----------------------------------------------------------------
		
		
		System.out.printf(x +"=" + y);
		System.out.println("\n");
		System.out.printf(x + "="+ w);
		System.out.print("\n");
		
		//-------------------------------Escrita-Divis�o---------------------------------------------------------------------
		System.out.println("\n");
		 resultado = (double)a/g;
		System.out.println("A Divis�o � : "+ resultado);
		System.out.println("\n");
		System.out.println(R);
		System.out.println("\n");
		//--------------------------------Escrita-Area-----------------------------------------------------------------------
	      
		area = (b+B)/ 2.0 *H;
		System.out.println("Area Do quadrado � : "+ area);
		
		
		//----------------------------------Escrita-Estatistica--------------------------------------------------------------
		System.out.println("\n");
         FR=(P*100)/N;
         System.out.println("O resultado da Estatisica � :" +FR);
         System.out.println(Math.round(FR));
         
	}

}
