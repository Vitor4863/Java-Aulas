package ec;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		  int Notas;
		  System.out.println("Alunos Aprovados ou Reprovados");
		 Notas = teclado.nextInt();
		
		  
		  if(Notas > 4) {
			  System.out.println(" Aprovado");
			  
		  }else {
			  System.out.println("reprovado");
		  }
       teclado.close();
	}

}
