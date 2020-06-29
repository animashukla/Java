package com.array;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of array : ");
		int size = sc.nextInt();
		
		System.out.println("Input elements of array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		SelectionSort ss = new SelectionSort();
		ss.sortA(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");	
		}
	}
	
	public void sortA(int arr[]){
		
		//int min=arr[0];
		for(int i=0;i<arr.length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
					int t = arr[minIndex];
					arr[minIndex]=arr[i];
					arr[i]=t;
				}
		}
		//System.out.println(min);
	}
}

//select the smallest element and exchange with the element at the beginning of the unsorted array
//9 5 6 1 3
//9,5
