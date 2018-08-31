package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.Cellphone;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.SetCar;
import com.capgemini.day6.domain.SetSchool;
import com.capgemini.day6.domain.SetTelevision;
import com.capgemini.day6.domain.Television;

class SetCollectionTest
{
	@Test
	void testCellphone()
	{
		HashSet<Cellphone> cellphone=new HashSet<>();
		assertEquals(true, cellphone.add(new Cellphone("samsung","j7","good phone","windows",10000)));
		assertEquals(true, cellphone.add(new Cellphone("apple","iphonex","good phone","mac",100000)));
		assertEquals(true, cellphone.add(new Cellphone("windows","two","worst phone","windows10",70000)));
		
		
		assertEquals(3, cellphone.size());
		
		for (Cellphone cellphone1 : cellphone)
		{
			System.out.println(cellphone1);
		}
	}
	@Test
	void testCar()
	{
		HashSet<SetCar> car=new HashSet<>();
		assertEquals(true, car.add(new SetCar("tata","nano",2005,2000)));
		assertEquals(true, car.add(new  SetCar("bmw","x7",2006,200000)));
		assertEquals(true, car.add(new  SetCar("hyundai","santro",2001,60000)));
		
		assertEquals(3, car.size());
		
		for (SetCar car1 : car)
		{
			System.out.println(car1);
		}
	}
	@Test
	void testSchool()
	{

		HashSet<SetSchool> school=new HashSet<>();
		assertEquals(true, school.add(new  SetSchool("Anu","Bvrm","Bhashyam","WG",1)));
		assertEquals(true, school.add(new  SetSchool("keerthy","Bvrm","narayana","EG",2)));
		assertEquals(true, school.add(new  SetSchool("srilu","Hyd","vzg","WG",3)));	assertEquals(3, school.size());
		
		for (SetSchool schoo : school)
		{
			System.out.println(schoo);
		}
	}
	
	@Test
	void testTelevision()
	{
		HashSet< SetTelevision> tv=new HashSet<>();
		assertEquals(true,tv.add(new  SetTelevision("Samsung","A","3d",35000)));
		assertEquals(true,tv.add(new  SetTelevision("Onida","B","3d",24000)));
		assertEquals(true, tv.add(new  SetTelevision("LG","C","3d",45000)));
	
		assertEquals(3, tv.size());
		
		for (SetTelevision tv1 : tv)
		{
			System.out.println(tv1);
		}
	}
	
}
	
		



