package com.array;

import java.util.Scanner;

public class FirstDuplicateElemnt {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("length of array::");
		int size = sc.nextInt();
				
		int arr[] = new int[size];
		System.out.println("elements of array:::");
		for(int k=0;k<arr.length;k++){
			arr[k]=sc.nextInt();
		}
		
		boolean isFound = false;
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					isFound=true;
					System.out.println("duplicate element : " + arr[j]);
					break;
				}
			}
			if(isFound){
				break;
			}
		}
		
	}

}
