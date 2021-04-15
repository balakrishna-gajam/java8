
public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector gc1 = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		gc1 = gc2;
		
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("hi....");

	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize");
	}
	

}
