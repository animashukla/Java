package com.array;

import java.util.Scanner;

public class SecondMaxElement {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Elements of array:::");
		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int maxElement = arr[0];
		int maxPOS = 0;
		for(int j = 1; j<arr.length;j++){
			if(arr[j]>maxElement){
				maxElement = arr[j];
				maxPOS=j;				
			}
		}
		int secMaxElem;
		if(arr[0]!= maxElement){
			secMaxElem = arr[0];
		}else{
			secMaxElem = arr[1];
		}
		for(int k=1;k<arr.length;k++){
			if(arr[k]>secMaxElem && k!=maxPOS){
				secMaxElem=arr[k];
			}
		}
		System.out.println(secMaxElem);
		System.out.println(maxElement);
	}

}
