package com.array;

import java.util.Scanner;

public class PairWithGivenSum {
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int size = sc.nextInt();
		System.out.println("Elements of array");
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Input the sum");
		int k = sc.nextInt();
		
		PairWithGivenSum pwg = new PairWithGivenSum();
		int pair[] = pwg.pairSum(arr, k);
		
		if(pair.length==2){
			System.out.println("pair is "+ pair[0]+"  "+ pair[1]);
		}else{
			System.out.println("No pair found");
		}
		
	}
	
	public int[] pairSum(int arr[], int k){
		
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==k){
					
					int pair[]={arr[i], arr[j]};
					return pair;					
				}	
			}
		}
		//return null;
		return (new int[0]);
	}

}

//0 -3 7 9 2
//k=4
//ans = -3, 7

//k=11
//0, -3 , sum!=4
//0, 7
//0,9
//0, 2, sum==4
//-3,7,
//-3,9
//-3, 2
//7,9
//7,2
//9,2
