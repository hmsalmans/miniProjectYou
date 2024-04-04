package apuCodes;

import java.lang.Math;
import java.util.Scanner;
public class ApuCodesTesting {  // THIS IS CLASS NAME
	
	

	public static void main(String[] args) {  //THIS IS MAIN METHOS
		// TODO Auto-generated method stub
		
		String iniName = "Salman";
		System.out.println(iniName);
		
		String fnalName = iniName;
		System.out.println(fnalName);
		
		System.out.println(fnalName.charAt(3)); //Char method
		
		System.out.println(fnalName.length()); // length method
		
		//---------------------
		int a = 23;
		int b = 7;
		
		//find modulo(remainder)
		
		int modu = a%b; // answer should be 2
		System.out.println(modu);
		
		//-----------------
		
		int c = 10;
		int d = 20;
	int res =	Math.max(c, d);
		System.out.println(res);
		
		System.out.println(Math.min(c, d));
		//------------------------- Taking Input using scanner class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your age---Please Type");
		
		int	inptReplied = sc.nextInt();
		
		System.out.println("So you age is "+ inptReplied);
		//--------------------------------
		
		int i;
		//lets practice continue keyword
		 for (i = 2; i <=20; i=i+2) {
			 if (i%3==0)  { // taking modulo here
				 continue;//skipping this and moving next iteration
			 }
			 
			 System.out.println(i); // answer should be 2,4,8,10,14,16,20
			 
		 }
		//lets practice break keyword
		 
		 for (i=1; i<=10; i++) {
			 
			 	if(i<5) {
				 System.out.println(i);
			 }	
			 	else if (i>=5) {
			 	 System.out.println(i+10);	
			 }
			 	if (i==8) {
			 		System.out.println("It should break after i reaches 8");
			 		break;
		    }
		 }	 	
		//--------------------------------
		 
		 
		
		

	 }
	
}
