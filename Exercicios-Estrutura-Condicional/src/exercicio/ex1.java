package exercicio;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int x;
		
		Scanner teclado = new Scanner(System.in);
		x = teclado.nextInt();
		if(x < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("Não negativo");
		}
      teclado.close();
	}
  
}
