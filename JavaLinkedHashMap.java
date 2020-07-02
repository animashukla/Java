package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put(33, "B1");
		linkedHashMap.put(36, "B2");
		linkedHashMap.put(32, "B3");
		linkedHashMap.put(03, "B40");
		
		for(Map.Entry e : linkedHashMap.entrySet() ){
			System.out.println(e.getKey()+ " "+ e.getValue());
		}

	}

}
