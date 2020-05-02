package datamaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFullName {
	
	averagePerson myAvgPerson = new averagePerson();

	@Test
	public void test() {
		
		//myAvgPerson.populate_Names();
		//myAvgPerson.setAllValues();		
		
		String str1,str2;
		

		str1 =  myAvgPerson.getFirstName();
		System.out.println(str1);	
		assertNotNull(str1);
		
		str2 =  myAvgPerson.getLastName();
		System.out.println(str2);
		assertNotNull(str1);
		
		str2 =  myAvgPerson.getGender();
		System.out.println(str2);	
		assertNotNull(str1);		
		
		str2 = Integer.toString(myAvgPerson.getAge());
		System.out.println(str2);
		assertNotNull(str1);		
		
		//fail("Not yet implemented");
		
	}

}
