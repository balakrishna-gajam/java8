package com.mycomp;

public class MainTest {

	public static void main(String[] args) {
		String s = "bcdbcdbcd";
		String s1 = "bcd";
		String[]sa=s.split(s1);
		for(String t : sa) {
			System.out.println(t);
		}
		
		System.out.println("12321");
	}

}
