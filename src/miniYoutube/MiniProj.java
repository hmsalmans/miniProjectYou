package miniYoutube;

import java.util.Scanner;

public class MiniProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int myNumbr = (int) (Math.random()*100);
		int usrNum = 0;
		
		do {
			System.out.println("Guess my Nummbers(1-100)");
			  usrNum = sc.nextInt();
			 
			 if (usrNum == myNumbr) {
				
				 System.out.println("WOOOHOO.. Correct Number");
				 break;
			 
			 } 
			 else if (usrNum > myNumbr) {
				 
				 System.out.println("Your NUmber is too large");
			 }
			 else {
				 System.out.println("Your NUmber is too small");
			 }
			
		} while(usrNum >= 0); {
			
			System.out.println("My number is: ");
			System.out.println(myNumbr);
		}
			
		

	}

}
