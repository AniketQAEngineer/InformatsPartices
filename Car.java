package Encapsulation;

public class Car {
	
	 private String companyname;
	 private String modelname;
	 private int year;
	 private int mileage;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	 
	public int getMileage() {
		return mileage;
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		c.setCompanyname("HONDA");
		c.setModelname("SHINE");
		c.setYear(1998);
		
		
		System.out.println("COMPANYNAME"+"  "+c.getCompanyname());
		System.out.println("MODELNAME"+"   "+c.getModelname());
		System.out.println("YEAR"+"  "+c.getYear());
		System.out.println("MILEAGE"+"  "+c.getMileage());
		
	}
	 
	 

	
	
}
