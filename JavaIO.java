package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaIO {
	
	public static void main(String args[]) throws IOException{
		
		//System.out.println("Input a string:::");
		
		String inputFileName = "C:\\Users\\hp\\workspace\\Java1\\Factory_1\\test.txt";
		String outputFileName="C:\\Users\\hp\\workspace\\Java1\\Factory_1\\test2.txt";
		
		FileReader fileReader = new FileReader(inputFileName);
		
		BufferedReader br = new BufferedReader(fileReader);
		
		PrintWriter pw = new PrintWriter(outputFileName);
		
		
		
		String str = null;
		while((str=br.readLine())!=null){
			
			//System.out.println(str);
			pw.println(str);
			
		}
		
		br.close();
		pw.close();
	}

}
