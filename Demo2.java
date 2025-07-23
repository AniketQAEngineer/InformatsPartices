package Encapsulation;

public class Demo2 {
	
	
       private String stdName;
       private int stdid;
       private int stdroll;
       
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public int getStdroll() {
		return stdroll;
	}
	public void setStdroll(int stdroll) {
		this.stdroll = stdroll;
	}
	
	
	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
		d.setStdid(101);
		d.setStdName("ANIKET");
		d.setStdroll(62151);
		
		
		
		System.out.println("NAME"+  d.getStdName());
		System.out.println("ID"+   d.getStdid());
		System.out.println("ROLLNO"+d.getStdroll());
		
		
	}



}
