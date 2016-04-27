package com.swacorp.selenium.page;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.junit.Test;

public class SimpleJBehave {


	private static Embedder embedder = new Embedder();
	private static List<String> storyPaths = Arrays.asList("com/swacorp/gradle/LoginPageMXI.story");

	public static void main(String[] args) {
		embedder.candidateSteps().add(new LoginPageMXI());
		embedder.runStoriesAsPaths(storyPaths);
	}

}