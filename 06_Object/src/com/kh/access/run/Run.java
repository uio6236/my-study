package com.kh.access.run;
import com.kh.access.AccessTest;
public class Run {

	public static void main(String[] args) {
		AccessTest test = new AccessTest();
		System.out.println(test.publicField);
		test.publicMethod();
		
		// => 패키지 경로가 다르기 때문에 protected, default, private 접근 불가!
		// System.out.println(test.protectedField);
		// test.protectedMethod();
		// System.out.println(test.defaultField);
		// test.defaultMethod();
		// System.out.println(test.privateField);
		// test.privateMethod();
	}

}
