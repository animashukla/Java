package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
	public Map<String, Integer> hMap;
	
	public DuplicateElement(){
		hMap=new HashMap();
	}
	
	public static void main(String args[]){
		
		DuplicateElement duplicateElement = new DuplicateElement();
		int arr[] = {5,3,68,99,3,12,4,5,13,5};
		
		//duplicateElement.duplicateValue(arr);
		
		duplicateElement.numberOfOccurance(arr);
		//System.out.println(dup+ " has a duplicate");
		
	}
	
	public void duplicateValue(int arr[]){
		//int dup=arr[2];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){//should depend on i, has to check the next element
				if(arr[i]==arr[j]){
					System.out.println(arr[j]+ " has a duplicate");//why j??
				}
			}
		}
		
	}
	//int arr[] = {5,3,68,99,3,12,4,5,13,5};
	//i=0:  5 , 1
	//i=1;  5, 1  -> 3, 1
	//i=2;  5,1, 3,1 - > 68, 1
	//i=3;  5, 1,  3, 1,  68, 1,  99, 1
	//i=4;  5,1  , 3,2,  68,1  99,1
	//i=5; 5,1  3,2   68,1   99,1
	//i=6; 5,1  3,2  68,1  99,1  4,1
	//i=7; 5, 2  3,2  68,1  99,1  4,1
	//i=8; 5,2  3,2  68,1   99,1  4,1  13,1
	//i=9; 5,3  3,2  68,1   99,1  4,1  13,1
	
	public void numberOfOccurance(int arr[]){
		HashMap<Integer, Integer> hashMap = new HashMap();
		for(int i=0;i<arr.length;i++){
			if(hashMap.containsKey(arr[i])){
				int temp = hashMap.get(arr[i]);//key
				hashMap.put(arr[i], temp+1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}
		for(Map.Entry e : hashMap.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}
	}

}
