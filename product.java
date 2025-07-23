package Encapsulation;

public class product {
	
	
	
	private int productid=101;
	private double productprice=500.25;
	
	
	public int getProductid() {
		return productid;
	}
	public int setProductid(int productid) {
		return this.productid = productid;
	}
	public double getProductprice() {
		return productprice;
	}
	public double setProductprice(double productprice) {
		return this.productprice = productprice;
	}
	
	
	
	public static void main(String[] args) {
		
		product p=new product();
		int returnid = p.getProductid();
        int setid = p.setProductid(103);
        
        double price = p.getProductprice();
        double setprice = p.setProductprice(3000);
        
        
        System.out.println("ID"+returnid);
        System.out.println("SETID"+setid);
        System.out.println("PRICE"+price);
        System.out.println("SETPRICE"+setprice);
        
        
	     
		
	}
	
	
	

}
