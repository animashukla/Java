package com.array;

import java.util.Scanner;

public class MinInt {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of array : ");
		int s = sc.nextInt();
		
		System.out.println("Input elements of array : ");
		int arr[]=new int[s];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		MinInt mi = new MinInt();
		mi.min(arr);
	}
	
	public void min(int arr[]){
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				/*int temp = min;
				min=arr[i];
				arr[i]=temp;*/
				min = arr[i];
			}
		}
		System.out.println("****"+min);
	}

}
