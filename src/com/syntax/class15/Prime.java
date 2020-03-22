package com.syntax.class15;

public class Prime {
	
     boolean isPrime(int a) {
    	
 		boolean isPrime=true;
 		
 		if(a>1) {
 			for(int i=2; i<a; i++) {
 				if(a%i==0) {
 					isPrime=false;
 					break;
 				}
 			}
 			
 		}else {
 			isPrime=false;
 		}
 		return isPrime;
 		
 	}
     
     public static void main(String[] args) {
    	 
    	 Prime num = new Prime();
    	 boolean n = num.isPrime(7);
    	 System.out.println(n);
    	 n=num.isPrime(8);
    	 System.out.println(n);
     }
 

}
