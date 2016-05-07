package ChapterOne;

public class OrderInitialization {

	private String name = "Flugy";
	{System.out.println("Setting field");}
	
	public OrderInitialization() {
		name = "Tinny";
		System.out.println("constructor");
	}
	
	public static void main(String[] args){
		
		OrderInitialization x = new OrderInitialization();
		System.out.println("Main");
		
	}	
}
