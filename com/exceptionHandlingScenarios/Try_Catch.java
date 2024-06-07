package com.exceptionHandlingScenarios;

public class Try_Catch {

	public static void main(String[] args) {

		try// try is a block, which can has problematic part/statements
		{
			String text = "My country name is vyanki";
			System.out.println(text.charAt(80));
		} catch (Exception e)// catch is a block, which has handler part/statements
		{
			e.printStackTrace();// to trace the exception in program, with instruction line number
		}

	}

}
