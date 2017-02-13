public class TwoHolidays {
	public static void main(String[] args){
		Holiday place1 = new Holiday("Canada" ,"31/01/2018" , "10/02/2018",  "£700");
		Holiday place2 = new Holiday("New York" , "06/03/2018" , "06/04/2018" ,  "£800");

		System.out.println("This is the first chosen destination");
		System.out.println(place1.getplace());
		System.out.println(place1.getstartDate());
		System.out.println(place1.getendDate());
		System.out.println(place1.getprice());
		
		System.out.println();
		
		System.out.println("This is the second chosen destination");
		System.out.println(place2.getplace());
		System.out.println(place2.getstartDate());
		System.out.println(place2.getendDate());
		System.out.println(place2.getprice());
	}
	
}