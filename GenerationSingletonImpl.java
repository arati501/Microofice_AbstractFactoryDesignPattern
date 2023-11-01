package com.microoffice;

import java.util.HashMap;
import java.util.Map;

public class GenerationSingletonImpl {
	private static final Map<String, Integer> instances = new HashMap<>();

	public static int getInstanceCount(String wordGeneration) {
		instances.putIfAbsent(wordGeneration, 0);
		instances.put(wordGeneration, instances.get(wordGeneration) + 1);

		if (instances.get(wordGeneration) > 2) {
			System.out.println("Warning: " + wordGeneration + " used more than twice.");
		}

		return instances.get(wordGeneration);
	}

}
