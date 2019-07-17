package day7;

import java.util.Scanner;

public class avengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int black = 5;
int pink = 10;
int blue= 15;
 
Scanner ecn= new Scanner (System.in);
String name = "";

System.out.println("enter your name");
name = ecn.next();

System.out.println("favorite coloer ");
ecn.next();

System.out.println("enter frst number");
black = ecn.nextInt();

System.out.println("enter second number");
pink = ecn.nextInt();

System.out.println("caculating .... adddition.... here's the  answer");
blue = pink + black;
 System.out.println(blue); 
 
 System.out.println("caculating.....subtracting.... here's the answer");
 blue =  pink - black;
 System.out.println(blue);
 
 System.out.println("caculating....multiplying.... here's the answer");
 blue = pink * black;
 System.out.println(blue);
 System.out.println(" caculating..... divison.....here's the answer");
 blue= pink/black;
 System.out.println(blue);
 
 System.out.println("thank you for your participation  " + name);
 
 
 
 


}
}