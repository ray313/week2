package day6;

import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner Ray= new Scanner(System.in);
        int Skudd = 2;
        int bob = 3;
        int pat = 1;
        
        double twins = 3.2;
        double bag = 1.2;
        double lunch = 7.4;
        
        System.out.println("Welcome to Ray's caculator");
        System.out.println("please enter a number ");
        Skudd = Ray.nextInt();
        System.out.println("please enter a number");
        bob = Ray.nextInt();
        pat = Skudd + bob;
        System.out.println(pat);
        System.out.println("this the diffrence");
      int Skudd1 = pat - bob;
        System.out.println(Skudd1);
        pat = Ray.nextInt();
        System.out.println(pat);
        pat = Skudd * bob;
        
        System.out.println("welcome to Ray's calculator");
        
        System.out.println("please enter a number");
        twins = Ray.nextInt();
         
        System.out.println("please enter second number");
        bag = Ray.nextInt();
        lunch = twins + bag;
        System.out.println("This is the sum of your numbers");
        
        lunch = bag - twins;
        System.out.println("this is the diffrence of your number");
         
        
        
       
        
        
        
        
        
        
        
              
                

				

	}

}
