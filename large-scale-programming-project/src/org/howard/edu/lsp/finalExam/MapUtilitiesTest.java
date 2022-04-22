package org.howard.edu.lsp.finalExam;

import MapUtilities;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class MapUtilitiesTest {
	@Test
	@DisplayName("MapUtilitiesTest.commonKeyValuePairs test cases")
	
	public void testCommonKeyValuePairs() throws NullMapException
	{
		HashMap<String, String> map1 = null;
		HashMap<String, String> map2 = null;
		HashMap<String, String> map3 = new HashMap<String, String>();
		HashMap<String, String> map4 = new HashMap<String, String>();
		HashMap<String, String> map5 = new HashMap<String, String>();
		HashMap<String, String> map6 = new HashMap<String, String>();
		
		map3.put("david", "lords");
		map3.put("Mo", "Salah");
		map3.put("LeBron", "James");
		map3.put("Black", "Stone");
		
		map4.put("Da", "James");
		map4.put("Mo", "Salah");
		map4.put("david", "lords");
		map4.put("Black", "Stone");
		
		map5.put("LeBron", "Blah");
		map5.put("david", "Salah");
		
		//testing if one of them is null
		Exception exception = assertThrows(NullMapException.class, () ->{
			commonKeyValuePairs(map1, map3);
			
		});
		
		String expectedMessage = "Either one of the maps is null or both of them are null";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
		
		//testing when both maps are null
		
		Exception exception2 = assertThrows(NullMapException.class, () ->{
			commonKeyValuePairs(map1, map2);
			
		});
		
		String expectedMessage2 = "Either one of the maps is null or both of them are null";
		String actualMessage2 = exception2.getMessage();
		assertTrue(actualMessage2.contains(expectedMessage2));
		
		//testing when one of them is empty
		
		int output = commonKeyValuePairs(map4, map6);
		int output2 = commonKeyValuePairs(map6, map3);
		
		assertEquals(String.valueOf(output), String.valueOf(0));
		assertNotEquals(String.valueOf(output), String.valueOf(1));
		
		assertEquals(String.valueOf(output2), String.valueOf(0));
		assertNotEquals(String.valueOf(output2), String.valueOf(1));
		
		//testing when both maps are empty
		HashMap<String, String> map7 = new HashMap<String, String>();
		
		int output3 = commonKeyValuePairs(map6, map7);
		
		assertEquals(String.valueOf(output3), String.valueOf(0));
		assertNotEquals(String.valueOf(output3), String.valueOf(3));
		
		//testing that null executes before empty so I'm testing a null and empty set
		
		Exception exception3 = assertThrows(NullMapException.class, () ->{
			commonKeyValuePairs(map1, map2);
			
		});
		
		String expectedMessage3 = "Either one of the maps is null or both of them are null";
		String actualMessage3 = exception3.getMessage();
		assertTrue(actualMessage3.contains(expectedMessage3));
		assertNotEquals(actualMessage3, String.valueOf(0));
		
		//testing to see it works properly when the lengths of the maps are equal
		
		int output4 = commonKeyValuePairs(map3, map4);
		
		
		assertEquals(String.valueOf(output3), String.valueOf(3));
		assertNotEquals(String.valueOf(output3), String.valueOf(0));
		
		
		
		
		
		
		
	
		
		
		
		
	}
	
	

}
