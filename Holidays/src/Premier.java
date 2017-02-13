
public class Premier extends Holiday{
	private String HotelGrade;
	private String HotelName;
	private String ResortName;
	
	public void Hotelgrade(String Hotelgrade){
		this.HotelGrade = Hotelgrade;
	}
	
	public String getHotelgrade(){
		return this.HotelGrade;
	}
	
	public void HotelName(String HotelName){
		this.HotelName = HotelName;
	}
	
	public String getHotelName(){
		return this.HotelName = HotelName;
	}
	
	public void ResortName(String ResortName){
		this.ResortName = ResortName;
	}
	
	public String getResortName(){
		return this.ResortName;
	}
	
	// Constructor
	public Premier(String place, String startDate, String endDate, String price, String HotelGrade, String HotelName, String ResortName){
		super (startDate, endDate, place, price);
		
		this.HotelGrade = HotelGrade;
		this.HotelName = HotelName;
		this.ResortName = ResortName;
	}
	

}
