package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda_Collen {
	
	Lambda_Collen(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,4,5,1);
		
		list.sort((a,b)-> a.compareTo(a));
		
		list.forEach(System.out::println);
		
		list.forEach(str -> System.out.println(str));
		
		//list.forEach();
		
		Set set = new HashSet();
		set.add(null);
		
		System.out.println(set.toString());
		
		 
		
		
		
	}
}
