package com;

public class Act13 {

	public static void main(String[] args) {
		
		int [] t = {1,4,6,7,8,9,10,12};
		
		System.out.println(maximo(t));
		
	}
	
	public static int maximo (int [] t) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i=0;i<t.length;i++) {
			
			if(t[i]>max) {
				
				max=t[i];
				
			}
			
		}
		return max;
		
		
	}

}
