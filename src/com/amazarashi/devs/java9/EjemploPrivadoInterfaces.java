package com.amazarashi.devs.java9;

interface Bar
{
	void foo();
	default void foo(int x) 
	{
		System.out.println(x);
		foo2(x);
	}
	//Tenemos un metodo deful y se puede segmentar
	//Al ser detalles de implemnetacion deben ser privados
	private void foo2(int x) 
	{
		System.out.println(x);
	}
	
	@SuppressWarnings("unused")
	private static void foo3() 
	{
		System.out.println();
	}
}


public class EjemploPrivadoInterfaces {
	public static void main(String[] args) {
		
	}

}
