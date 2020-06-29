package com.array;

import java.util.Scanner;

public class RemoveDuplicateElements {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of array : ");
		int size = sc.nextInt();
		
		System.out.println("Input elements of array : ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int arr2[] = new int[size-1];//
		RemoveDuplicateElements rde = new RemoveDuplicateElements();
		rde.removeDuplicate(arr,arr2);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+ " ");
		}
	}
	
	public void removeDuplicate(int arr[], int arr2[]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<i;j++){
				if(arr[i]!=arr[j]){
					arr2[j]=arr[j];
				}
			}
		}
	}

}
