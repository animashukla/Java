package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list= new ArrayList();
		list.add("xyz");
		list.add("abc");
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
