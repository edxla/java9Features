package com.amazarashi.devs.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

;
interface Foo<T>
{

}
public class OperadorDiamante {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		List<String> lista = new ArrayList<>();
		
		@SuppressWarnings("unused")
		Foo<Map<String,Map<String,String>>> foo = new Foo<>() {
		};
		
	}

}
