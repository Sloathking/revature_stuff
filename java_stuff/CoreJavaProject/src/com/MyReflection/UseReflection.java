package com.MyReflection;

import java.lang.reflect.Method;

public class UseReflection {
	public static void main(String[] args) {
		Employee e1 = new Employee();
//		System.out.println(e1);
		
		Class<?> cls = e1.getClass();
//		System.out.println(cls.getClass());
//		System.out.println(cls.getName());
//		System.out.println(cls.getSimpleName());
//		System.out.println(cls.getPackageName());
//		System.out.println(cls.getInterfaces());
//		System.out.println(cls.isInterface());
		
		Method[] classMethods = cls.getMethods();
		for (Method m : classMethods) {
			System.out.println(m.toString());
		}
	}
}
