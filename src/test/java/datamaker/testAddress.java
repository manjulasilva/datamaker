package datamaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddress {
	
	averagePerson myAvgPerson = new averagePerson();

	@Test
	public void test() {
		
		String str1,str2;
		
		
		str2 =  myAvgPerson.getAddressLine1_houseNumber();
		System.out.println(str2);
		assertNotNull(str2);
		
		str2 =  myAvgPerson.getAddressLine2_StreetName();
		System.out.println(str2);
		assertNotNull(str2);
		
		str2 =  myAvgPerson.getCity();		
		System.out.println(str2);
		assertNotNull(str2);
		
		str2 =  myAvgPerson.getState();
		System.out.println(str2);
		assertNotNull(str2);
		
		str2 =  myAvgPerson.getPostCode();
		System.out.println(str2);
		assertNotNull(str2);
		
		System.out.println(" - - -  - - ");
		
		str2 =  myAvgPerson.getFullAddressIn3Lines();
		System.out.println(str2);
		assertNotNull(str2);
		
		System.out.println(" mmmmmmmmmmmmmmmmmmm ");
		
		str2 =  myAvgPerson.getCreditCardNumber();
		System.out.println(str2);
		assertEquals(str2,"5555555555554444");
		
		str2 =  myAvgPerson.getCreditCardType();
		System.out.println(str2);
		assertNotNull(str2);
		assertEquals(str2,"MasterCard");
		
		str2 = Integer.toString(myAvgPerson.getCreditCardCVV());
		System.out.println(str2);
		assertEquals(str2,"123");
		

		
		//fail("Not yet implemented");
	}

}
