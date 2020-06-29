package com.array;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array::");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Elements of array::");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println("Elemnt to be searched:: "+k);
		
		LinearSearch bs = new LinearSearch();
		bs.searchElement(arr, k);
	}
	
	public int searchElement(int arr[], int k){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k){
				System.out.println("element = "+arr[i]);
			}
		}
		
		return k;
	}

}
