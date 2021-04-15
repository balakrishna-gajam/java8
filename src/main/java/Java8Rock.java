import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Rock {

	public static void main(String[] args) {
		
		List<String> dataList = Arrays.asList("6","3","1","4","2","5");
		
		//dataList.stream().sorted().forEach(System.out::println);
		
		Ex1 e1 = new Ex1("one");
		Ex1 e2 = new Ex1("two");
		Ex1 e3 = new Ex1("three");
		
		List<Ex1> l = Arrays.asList(e1,e2,e3);
		
		Ex1 e = l.stream().filter(x -> x.getName().equals("one")).findAny().orElse(null);
		String val = l.stream().filter(x -> x.getName().equals("one")).map(Ex1 :: getName).findAny().orElse(null);
		
		//System.out.println(e.toString() +" "+ val);
		
		
		String[] data2 = new String[]{"a", "b", "c", "d","e", "f"}; 
        Stream<String> temp2 = Arrays.stream(data2);

        //filter a stream of string[], and return a string[]?
        Stream<String> stream2 = temp2.filter(x -> "a".equals(x.toString()));

        //stream2.forEach(System.out::println);
        
        System.out.println("***********************1********************");
        
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> {
        						System.out.println(x);
        						return ("a".equals(x.toString()));
        					});

        stream.forEach(System.out::println);

		System.out.println("************************2*******************");
        
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect =
                list.stream()
                        .map(x -> x.getBook())      //Stream<Set<String>>
                        .flatMap(x -> x.stream())   //Stream<String>
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
		
        System.out.println("*******************************************");
        
        List<String> dataList1 = Arrays.asList("6","3","1","1","2","5");
        
        dataList1.parallelStream().distinct().forEach(System.out::print);;
        
        System.out.println("*******************************************");
        
      //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) );

        System.out.println(result);
		
	}

}

class Ex1 {
	
	Ex1(String name) {
		this.name = name;
	}
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}


class Student {

    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}
    

}
