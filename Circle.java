package Encapsulation;

public class Circle {
	
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	void claculateArea() {
		
		
	 double circle = 3.14*radius*radius;
	 System.out.println("CIRCLE"+circle);
	}
     void calculateperimeter()
      {
    	 
    	 double perimeter = 2*3.14*radius;
    	 System.out.println("PERIMETER"+perimeter);
    	  
      }
     
     
     public static void main(String[] args) {
    	 
    	 Circle c=new Circle();
    	 c.setRadius(2.5);
    	 c.claculateArea();
    	 c.calculateperimeter();
    	 System.out.println("RADIUS"+"  "+c.getRadius());
    	 
    	 
    	 
		
	}
}
