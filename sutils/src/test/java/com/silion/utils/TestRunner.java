package com.silion.utils;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SuiteTest.class);
		for (Failure failue : result.getFailures()) {
			System.out.println(failue.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
