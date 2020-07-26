package BehaviouralPatterns;

public class HouseClient {
public static void main(String[] args) {
		
		HouseTemplate ob = new WoodenHouse();
		
		//using template method
		ob.buildHouse();
		System.out.println("************");
		
		ob = new GlassHouse();
		
		ob.buildHouse();
	}

}
