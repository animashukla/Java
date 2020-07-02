package com.collection;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hashMap = new HashMap<>();
		hashMap.put(20, "A1");
		hashMap.put(25, "A2");
		hashMap.put(21, "A4");
		
		for(Map.Entry e : hashMap.entrySet() ){
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		
		for(Integer key : hashMap.keySet()){
			System.out.println("key :::"+hashMap);
		}

	}

}
