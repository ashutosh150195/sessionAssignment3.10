package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringComparison {
	
	private static BufferedReader br ;
	private static String input , input1;
	private static boolean same ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		input1 = br.readLine();
		
		same = true ;
		
		if (input.equals(input1)) {
			System.out.println(same);
		} else {
			System.out.println(!same);
		}
		
		if (input == input1) {
			System.out.println(same);
		} else {
			System.out.println(!same);
		}
	}

}
