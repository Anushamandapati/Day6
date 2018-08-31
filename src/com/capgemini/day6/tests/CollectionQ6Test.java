package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class CollectionQ6Test
{
	@Test
	void testStudentFavouriteFruit() 
	{
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		String[] favorites = new String[] {"Papaya","Orange"};
		map.put("Anu", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"Apple","Mango","orange"};
		map.put("Keerthy", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"Banana","Pineapple"};
		map.put("Srilu", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"Pomegranate","Papaya","apple"};
		map.put("Paddu", new ArrayList<>(Arrays.asList(favorites)));
		assertEquals(4, map.size());
		for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
