package day7;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Revon = new Scanner (System.in);
		
		int cat = 15;
		int dog = 20;
		int mouse = 5;
		
		String lucky= ""; 
		
			
		
		long bands= 100;
		long money= 90;
		long roll= 80;
		System.out.println("welcome to Revon's caculator");
		
		System.out.println("name");
		lucky= Revon.next();
		System.out.println("please enter a number");
		
		 cat= Revon.nextInt();
		
		System.out.println("please enter a number");
		 dog = Revon.nextInt();
		 System.out.println("this is the sum");
	
		int mouse1= dog + cat ;
		System.out.println(mouse1);
		
		
		System.out.println(" this is the diffrence ");
		
		 int mouse11 = dog - cat;
		 System.out.println(mouse11);
		
		System.out.println("this is the product");
		int mouse111 = dog * cat;
		System.out.println(mouse111);
		System.out.println("this is the quotient");
		int mouse1111= dog/cat;
		
		
		
		System.out.println(mouse1111);
		
		
		System.out.println("thanks for your participation Skudd");
		 		
		
		
		
		
		
				
		
		
		
				
		

	}

}
