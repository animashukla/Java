package com.array;

import java.util.Scanner;

public class TriangularSort {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array: ");
		int size = sc.nextInt();
		System.out.println("Input elements of array : ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		TriangularSort ts = new TriangularSort();
		//ts.sort(arr);
		ts.isTriangularSorted(arr);
		
	}
	
	public void sort(int arr[]){
		
		int x = arr[0];
		for(int i=1;i<arr.length;i++){
			if(x<arr[i]){
				
				x=arr[i];
			}
			
		}
		System.out.println("largerst element: "+x);
	}
	
	public boolean isTriangularSorted(int arr[]){
		
		int x=arr[0];
		for(int i=0; i<arr.length-1;i++){
			for(int j=1;j<i+1;j++){
				int diff = (arr[i] - arr[j]);
				if(diff != (arr[i+1] - arr[j+1])){
					x = arr[j];
				}
				
			}		
		}
		
		return false;
	}

}

//1 2 3 4 5 100 98 96 94 92
//no repetition of elements
//2-1 = 3-2
//5-4 != 100-5  =>
//100-98 = 98-96