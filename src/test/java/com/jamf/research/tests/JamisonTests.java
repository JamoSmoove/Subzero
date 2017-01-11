package com.jamf.research.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.jamf.research.Jamison;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class JamisonTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"Go Team",
				"Yes, James, you can work in Lambda",
				"Elite!",
				"I eat difficult conversations for breakfast"};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String jamisonSaid = Jamison.saySomething();

		// assert
		assertEquals(true, sayingsList.contains(jamisonSaid));
	}
}
