package com.abhilash.dictionary;

import java.util.Arrays;
import java.util.Hashtable;

public class CountWordOccurences {
	public static void main(String[] args) {
		String longString = "Hi Abhilash welcome! welcome again :) Hi WellsFargo Abhilash :)";
		
		Hashtable<String, Integer> dictionary = new Hashtable<String, Integer>();
		String[] splitted = longString.split(" ");
		System.out.println(splitted[0]);
		System.out.println(splitted.length);
		Arrays.asList(splitted).stream().forEach(item -> {
			dictionary.put(item, 0);
		});
		
		Arrays.asList(splitted).stream().forEach(item -> {
			int count = dictionary.get(item);
			dictionary.replace(item, count + 1);
		});
		
		System.out.println(dictionary.keySet());
		System.out.println(dictionary.values());
	}
}
