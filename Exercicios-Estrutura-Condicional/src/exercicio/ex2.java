package exercicio;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int x ;
		
		Scanner teclado = new Scanner(System.in);
		
	    x = teclado.nextInt();
	    
	    if(x != 5) {
	    	System.out.println("par");
	    	
	    }else {
	    	System.out.println("impa");
	    }
     teclado.close();
	}

}
