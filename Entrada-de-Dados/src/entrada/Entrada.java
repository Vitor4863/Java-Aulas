package entrada;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int F;
		double G;
		char p;
		
		x = sc.next();
		F = sc.nextInt();
		G = sc.nextDouble();
		p = sc.next().charAt(0);
		System.out.println("Voce Digitou o valor: "+ x);
		System.out.println("Digite um numero Inteiro: "+ F);
		System.out.println("Digite um numero Double: " + G);
		 System.out.println("Digite uma letra: " + p);
		
		sc.close();

	}

}
