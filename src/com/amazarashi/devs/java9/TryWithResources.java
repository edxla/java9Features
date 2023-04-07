package com.amazarashi.devs.java9;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		try(isr) {
			
		} catch (IOException e) {
			
			System.out.println(isr.toString());
		}
		
		
	}

}
