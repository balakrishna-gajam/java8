package com.mycomp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class A{}
class B extends A{}
class C extends B{}




public class MainTest1 {
	static String s;
	MainTest1(String t){
		s = t;
	}
	

	public static void main(String[] args) {
		/*
		 * PriorityQueue p = new PriorityQueue(); p.add("1"); p.add("2"); p.add("3");
		 * p.add("2");
		 * 
		 * System.out.println(p.size() +" "+p.poll()); System.out.println(p.size()
		 * +" "+p.peek()); System.out.println(p.size() );
		 */
		/*
		 * String s =
		 * "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabca";
		 * String t = "abcabc";
		 * 
		 * System.out.println(solu(s, t));
		 */
		
		
		
	}
	
	static int sockMerchant(int n, int[] ar) {
        int matched = 0;
        if(n >0 && n == ar.length){
        	
            List<Integer> list = new ArrayList(Arrays.asList(ar));
            Set<Integer> set = new HashSet(list);
            Map<Integer,Integer> map = new LinkedHashMap();
            for(Integer i : set) {
            	for(int j =0; j< list.size(); j++) {
            		if(i.intValue() == list.get(j)) {
            			
            		}
            	}
            }
            
            
            
        	
        }
        
        return matched;
    }
	
	/*
	 * private static int solu(String s, String t) { if(s.length() % t.length() !=
	 * 0) return -1; int l2 = t.length(); for(int i=0;i<s.length();i++) {
	 * if(s.charAt(i) != t.charAt(i%l2)) return -1; }
	 * 
	 * return count(t); }
	 * 
	 * static int count(String s2) {
	 * if(s2.substring(0,s2.length()/2).contentEquals(s2.substring(s2.length()/2,
	 * s2.length()))) { return count(s2.substring(0,s2.length()/2)); }else { return
	 * s2.length(); }
	 * 
	 * }
	 */

}
