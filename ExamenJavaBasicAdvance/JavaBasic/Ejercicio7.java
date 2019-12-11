package com.softtek.academia.java;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
	
	static Map <String, String> Maps = new HashMap();
	
	public void OPersonaje (String key) {
		System.out.println(key + " " + (Maps.get(key)));
	}
	
	public static void main(String[] args) {
		
		Maps.put("a1234", "Steve Jobs ");
		Maps.put("a1235", "Scott McNealy");
		Maps.put("a1236", "Jeff Bezos");
	    Maps.put("a1237", "Larry Ellison");
		Maps.put("a1238", "Bill Gates");
		 
		 Ejercicio7 result = new Ejercicio7();
		 result.OPersonaje("a1236");
	}

}
