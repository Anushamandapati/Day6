package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import com.capgemini.day6.domain.StudentNat;

class StudentNaturalTest
{
	@Test
	void testStudent()
	{
		TreeSet<StudentNat> ts = new TreeSet<>();
		assertEquals(true, ts.add(new StudentNat("Anu",1)));
		assertEquals(true, ts.add(new StudentNat("Anusha",2)));
		assertEquals(true, ts.add(new StudentNat("A",3)));
		assertEquals(true, ts.add(new StudentNat("An",4)));
		for(StudentNat s : ts)
		{
			System.out.println(s);
		}
		
	
	}

}
