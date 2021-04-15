
public  class PassByValue {

	public static void main(String[] args) {
		
		Pass p = new Pass();
		p.setName("hihi");
		int i=10;
		new PassByValue().print(p, i);
		
		System.out.println(p.getName() + " "+i);

	}
	
	public void print(Pass p, int i) {
		i=11;
		p = new Pass();
		p.setName("adfasdf");
		System.out.println(p.getName() +" "+ i);
	}

}


class Pass{
	
	
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
