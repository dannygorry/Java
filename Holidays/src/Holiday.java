public class Holiday {
	
private String startDate;
private String endDate;
private String place;
private String price;

public void startDate(String startDate){
	this.startDate = startDate;
}

public String getstartDate(){
	return this.startDate;
}

public void endDate(String endDate){
	this.endDate = endDate;
}

public String getendDate(){
	return this.endDate;
}

public void setPlace(String place){
	this.place = place;
}

public String getplace(){
	return this.place;
}

public void price(String price){
	this.price = price;
}

public String getprice(){
	return this.price;
}

// Contructor
public Holiday(String place, String startDate, String endDate, String price ){
	this.place = place;
	this.startDate = startDate;
	this.endDate = endDate;
	this.price = price;
	

}
public Holiday(){
	place = "Poland";
	startDate = "10/03/2017"; 
	endDate = "10/04/2017";
	price = "£400";
}





}

