package com.jamf.research;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class Jamison {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Go Team",
				"Yes, James, you can work in Lambda",
				"Elite!",
				"I eat difficult conversations for breakfast"};
		return sayings[selection % sayings.length];
	}
}
