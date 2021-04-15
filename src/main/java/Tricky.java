import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Tricky {

	public static void main(String[] args) {
		/*
		 * // TODO its test one
		 * 
		 * System.out.println(args.length); String ar[] = {"abc", "2", "0", "z", "1"};
		 * List<String> list = Arrays.asList(ar); Collections.sort(list);
		 * 
		 * System.out.println(list); StringBuffer str = new StringBuffer("gbkrishna");
		 */ 
		int carParkingLots = 12;
		List<Integer> possiblePositions = Arrays.asList(2,6,7,12);
		int numberOfCars = 3;
		
		Map<String, Integer> dataMap = new LinkedHashMap<>();
		int endPosition = 0;
		
		int tempCarCount = 0;
		for( int i=0; i< (possiblePositions.size() -1); i++) {
			int tempCount = 0;
			tempCarCount = 0;
			int startPosition = possiblePositions.get(i);
			String positionsKey = startPosition+"";
			tempCarCount++;
			
			for(int j=i+1; j < possiblePositions.size(); j++ ) {
				endPosition = possiblePositions.get(j);
				positionsKey += "-"+endPosition;
				tempCarCount++;
				
				for(int k= startPosition; k <= endPosition; k++ ) {
					tempCount++;
				}
				startPosition = endPosition;
				if(tempCarCount == numberOfCars) {
					dataMap.put(positionsKey, tempCount);
					break;
				}
			}
		}
		
		System.out.println(dataMap.toString());
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
