package Product1;

import java.util.Locale;

public class Product {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
      
		
		System.out.println("Products:");
		System.out.printf( "%s wich price is R$%.2f  %n",product1,price1);
		System.out.printf(product2 + " witch price is R$%.2f%n", price2 ); 
		 System.out.println("\n");
		 
		 System.out.println("Record: "+ age +" years old ,code " + code + " and gender :" + gender);
		 System.out.println("\n");
		 
		 System.out.println("measue witch eigth decimal places: " + measure);
		 
	     System.out.printf("Rouded ( three decimal places): %.3f  %n", measure);
	     Locale.setDefault(Locale.US);
	     System.out.printf("US decimal point: %.3f %n" ,measure);
		 
		 
		  
	}
}