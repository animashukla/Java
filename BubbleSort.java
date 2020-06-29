package com.array;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array:: ");
		int size = sc.nextInt();
		System.out.println("Input elements of array:: ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
	}
	
	public void bubbleSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t;
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}	
			}
			//System.out.println("i:::"+i);
		}
		
		for(int i=0;i<arr.length;i++){
			//System.out.println();
			System.out.print(arr[i]+" ");
		}
		
	}

}
//2 5 9 4 3 44 12
//compare 2,5 =>sorted
//2,9 
//2,4
//2,3
//2,44
//2,12
//5,9
//5,4 => swap 2 4 5 9 3 44 12
//4,5
//4,9
//4,3=> swap 2 3 5 9 4 44 12
//3,5
//3,9
//3,4
//3,44
//3,12
//5,9
//5,4=>swap 2 3 4 5 9 44 12
//5, 9 
// 5,44
//5,12
//9,44
//9,12
//44,12=>swap 2 3 4 5 9 12 44
//12, 44