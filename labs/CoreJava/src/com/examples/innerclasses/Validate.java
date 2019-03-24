package com.examples.innerclasses;

public class Validate {
	public interface ValidateEmployee{
		public boolean check(int age);
	}
public static boolean validate(ValidateEmployee validator,int age) {
	return validator.check(age);
}
}
