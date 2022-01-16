package BasicConcept;

import java.util.Scanner;

public class Primitive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



        Scanner sc = new Scanner(System.in);
         System.out.println(" Enter the string");
           String s = sc.nextLine();
 
           
      
      
      double dnum = Double.valueOf(s);
      System.out.println(dnum);
      
      
      int inum = Integer.valueOf(s);
      System.out.println(inum);
	     


      long lnum = Long.parseLong(s);
      System.out.println(lnum);
      
      boolean bnum = Boolean.parseBoolean(s);
      System.out.println(bnum);
      
       
	}		
		
		 
	

}
