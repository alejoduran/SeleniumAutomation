package com.swacorp.selenium.page;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.junit.Test;

import com.swacorp.selenium.steps.LoginPageMXI;

public class SimpleJBehave {


	private static Embedder embedder = new Embedder();
	private static List<String> storyPaths = Arrays.asList("story/LoginPageMXI.story");

	public static void main(String[] args) {
		embedder.candidateSteps().add(new LoginPageMXI());
		embedder.runStoriesAsPaths(storyPaths);
	}

}