package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractise {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Ammu");
		Person p2 = new Person();
		p2.setName("Shru");
		Person p3 = new Person();
		p3.setName("Balu");
		
		List<Person> list = Arrays.<Person>asList(p1,p2,p3);
		
		List dataList = list.stream().map(Person :: getName).map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(dataList);
		
		dataList = list.stream().map(p -> p.getName()).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(dataList);
		
	}

}


class Person{
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
