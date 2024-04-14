package sample;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> anylist = new ArrayList<Integer>();
		  
		  
		  anylist.add(25); 
		  anylist.add(22); 
		  anylist.add(2, 44); //this will make sure 44 added to index 1.
		  anylist.add(66); 
		  anylist.add(0, 13);//this will make sure 13 added to index 0.
		  anylist.add(28);
		  
		  System.out.println(anylist);

	}

}
