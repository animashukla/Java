package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList= new LinkedList<>();
		linkedList.add("cfg");
		linkedList.add("icf");
		
		Iterator <String> itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
