package com.array;

import java.util.Scanner;

public class MergedSortedArray {
	
	public static void main(String args[]){
		Scanner  sc = new Scanner(System.in);
		System.out.println("Input size of 1st array : ");
		int m = sc.nextInt();
		System.out.println("Elements of first array : ");
		int arr1[] = new int[m];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Input size of 2nd array : ");
		int n = sc.nextInt();
		System.out.println("Elements of second array : ");
		int arr2[] = new int[n];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Merged array size : " + (m+n));
		
		System.out.println("Elements of merged array : ");
		int arrMerged[]=new int[(m+n)];
		MergedSortedArray msa = new MergedSortedArray();
		msa.mergeArray(arr1, arrMerged,arr2);
		for(int i=0;i<arrMerged.length;i++){
			System.out.print(arrMerged[i] + " ");
		}	
	}
	
	public void mergeArray(int arr1[], int arrMerged[], int arr2[]){
		int x=0;
		for(int i=0;i<arr1.length;i++){	
			arrMerged[i]=arr1[i];
			x++;
		}
		for(int i=0;i<arr2.length;i++){
			arrMerged[x++]=arr2[i];
		}	
	}
}
