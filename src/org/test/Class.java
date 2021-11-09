package org.test;

public class Class {
	
       public static void main(String[] args) {
         System.out.println(1);
         System.out.println(2);
         System.out.println(3);
         System.out.println(4);
        
         {
       try   
       {
       System.out.println(5/0);
         
       }
       catch(ArithmeticException e) {
       System.out.println("dont divide by zero");
       
       }
       finally{
    	   System.out.println("success");
       }
       
}
       }
}
