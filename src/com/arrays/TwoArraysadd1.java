package com.arrays;


public class TwoArraysadd1 {

	public static void main(String[] args) {
		int []a1= {2,4,5,7,3,};
		int []a2= {5,9,7,8,4};
				
		
		int len=0;
		
		if(a1.length>a2.length) {
			len=a1.length;
		}else {
			len=a2.length;
		}
		
		int a3[]=new int [len];
		
		for(int i=0;i<len;i++) {
			if(a1.length<=i) {
				a3[i]=a2[i];
			}else if(a2.length>=i){
				a3[i]=a1[i];
			}else {
				a3[i]=a1[i]+a2[i];
				System.out.println(a3[i]);
			}
		}
		
//		System.out.println(Arrays.toString(a3));

	}

}
