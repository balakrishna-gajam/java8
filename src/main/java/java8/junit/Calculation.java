package java8.junit;

public class Calculation {
	
	public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
	public static boolean findMaxBoolean(int arr[]){
		boolean flag = false;
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i]) {
            	max=arr[i];
            	flag = false;
            }
                  
        }  
        return flag;  
    }  
	
	

}
