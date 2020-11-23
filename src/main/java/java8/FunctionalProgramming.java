package java8;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// takes a Long, returns a String
		Function<Long, String> f = l -> l.toString();
		
		System.out.println(f.apply(123l));

		// takes nothing gives you Threads
		Supplier<Thread> s =Thread::currentThread;
		System.out.println(s.get());

		// takes a string as the parameter 
		Consumer<String> c = System.out::println;
		c.accept("123");
		//c("123");

	}

}
