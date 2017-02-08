
public class PremierHoliday {
	public static void main(String[] args){
		Premier hotel1 = new Premier("Excellent", "AJ's Hotel", "Hawaii Resort");
		Holiday place3 = new Holiday("15/07/2017", "27/07/2017", "Hawaii", "£800");
		
		System.out.println(hotel1.getHotelgrade());
		System.out.println(hotel1.getHotelName());
		System.out.println(hotel1.getResortName());
		System.out.println();
		System.out.println(place3.getstartDate());
		System.out.println(place3.getendDate());
		System.out.println(place3.getplace());
		System.out.println(place3.getprice());
	}
	
	
}
