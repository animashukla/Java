package com.array;

import java.util.Scanner;

public class FirstMissingNumber {
	
	public static void main(String args[]){
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of array");
		int size = sc.nextInt();
		System.out.println("Elements of array");
		int arr [] = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length-1;j++){
			if((arr[j+1]-arr[j])>1){
				System.out.println(arr[j+1]-1);
				break;
			}
			
		}
		
	}
	
}
//11 12 13 14 15 16
//1. Compare 11 and 12, diff=1
//2. compare 12, 13, diff=1
//3. compare 13, 14, diff=1 
//4. compare 14, 15, diff=1
//5. compare 15, 16, diff=1
