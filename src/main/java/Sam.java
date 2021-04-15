import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sam {

	public static void main(String[] args) {
		
		// System.out.println(triplets(8, Arrays.asList(1,2,3,4,5)) );
		
		Performance p_2020_1 = new Performance(2020, 1);
		Performance p_2020_2 = new Performance(2020, 2);
		Performance p_2020_3 = new Performance(2020, 3);
		
		Performance p_2019_1 = new Performance(2019, 1);
		Performance p_2019_2 = new Performance(2019, 2);
		Performance p_2019_3 = new Performance(2019, 3);
		
		Performance p_2018_1 = new Performance(2018, 1);
		Performance p_2018_2 = new Performance(2018, 2);
		Performance p_2018_3 = new Performance(2018, 3);
		
		Employee emp1 = new Employee("Krishna", 1, Arrays.asList(p_2020_1,p_2019_1, p_2018_2));
		Employee emp2 = new Employee("GB", 2, Arrays.asList(p_2020_2,p_2019_3, p_2018_3));
		Employee emp3 = new Employee("GB Krishna", 3, Arrays.asList(p_2020_3,p_2019_2, p_2018_1));
		
		List<Employee> dataList = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));
		
		// Stream<Employee> finalList = dataList.stream().filter( emp -> emp.getPeformanceList().stream().filter( p -> p.getYear()==1) );
		List<Employee> finalList = new ArrayList<>();				
		dataList.stream().forEach(emp ->{
			List<Performance> performList = emp.getPeformanceList().stream().filter(p -> p.getRanking() ==1).collect(Collectors.toList());
			emp.setPeformanceList(performList);
			finalList.add(emp);
		});
		
		finalList.stream().forEach(emp -> {
			System.out.println(emp.getName() + "\n");
			emp.getPeformanceList().stream().forEach(p ->{
				System.out.println( "\t" + p.getYear() +" "+ p.getRanking());	
			});
		} );
		
		
		
	}
	
	
	static long triplets(long t, List<Integer> d) {
        int temp=0;
        long count =0;
        for(int i=0; i< d.size() ; i++){
            temp = d.get(i);
            for(int j=i+1; j<d.size(); j++){
                int temp1 = temp + d.get(j);
                for(int k=j+1; k<d.size(); k++){
                    int temp2 = d.get(k);
                    if((temp1 + temp2) <=t){
                      count ++;  
                      System.out.println(d.get(i) + "+"+ d.get(j) + "+" + d.get(k));
                    }
                }
            }
        } 
        return count;   
    }

}

class Employee {
	String name;
	int id;
	List<Performance> peformanceList = new ArrayList<>();
	
	public Employee(String name, int id, List<Performance> peformanceList) {
		super();
		this.name = name;
		this.id = id;
		this.peformanceList = peformanceList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Performance> getPeformanceList() {
		return peformanceList;
	}

	public void setPeformanceList(List<Performance> peformanceList) {
		this.peformanceList = peformanceList;
	}
	
}

class Performance {
	int year;
	int ranking;
	
	public Performance(int year, int ranking) {
		super();
		this.year = year;
		this.ranking = ranking;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
}
