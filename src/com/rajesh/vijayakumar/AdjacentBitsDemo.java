package com.rajesh.vijayakumar;

public class AdjacentBitsDemo {

	static boolean adjacentSet(int n) { 
        int x = (n & (n >> 1)); 
          
        if(x == 1) 
            return true; 
        else
            return false; 
    } 
      
    public static void main(String args[])  
    { 
 
        int n = 3; 
          
        if(adjacentSet(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");  
  
    } 
}
