package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.Cellphone;
import com.capgemini.day6.domain.Laptop;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Television;

class CollectionTest 
{
	@Test
	void testCar()
	{
		ArrayList<Car> car=new ArrayList<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,2000)));
		assertEquals(true, car.add(new Car("bmw","x7",2006,200000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2001,60000)));
	}
	@Test
	void testCellphone()
	{
		ArrayList<Cellphone> cell=new ArrayList<Cellphone>();
		assertEquals(true, cell.add(new Cellphone("samsung","j7","good phone","windows",10000)));
		assertEquals(true, cell.add(new Cellphone("apple","iphonex","good phone","mac",100000)));
		assertEquals(true, cell.add(new Cellphone("windows","two","worst phone","windows10",70000)));
	}
	@Test
	void testSchool()
	{
		ArrayList<School> school=new ArrayList<School>();
		assertEquals(true, school.add(new School("Anu","Bvrm","Bhashyam","WG",1)));
		assertEquals(true, school.add(new School("keerthy","Bvrm","narayana","EG",2)));
		assertEquals(true, school.add(new School("srilu","Hyd","vzg","WG",3)));
	}
	
	@Test
	void testLaptop()
	{
		ArrayList<Laptop> laptop=new ArrayList<Laptop>();
		assertEquals(true, laptop.add(new Laptop("lenovo","A","windows","i3")));
		assertEquals(true,laptop.add(new Laptop("Dell","B","Unix","i4")));
		assertEquals(true, laptop.add(new Laptop("macbook","C","Macos","i5")));
	}
	@Test
	void testTelevision()
	{
		ArrayList<Television> tv=new ArrayList<Television>();
		assertEquals(true,tv.add(new Television("Samsung","A","3d",35000)));
		assertEquals(true,tv.add(new Television("Onida","B","3d",24000)));
		assertEquals(true, tv.add(new Television("LG","C","3d",45000)));
	}
	
}
