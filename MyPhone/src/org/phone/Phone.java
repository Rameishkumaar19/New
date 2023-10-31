package org.phone;


public class Phone {

	private void phone(int serno) {
		System.out.println(serno); 
	}
	private void phone(String Name) {
		 System.out.println(Name);
	}
	private void phone(int phno,String phnName,char male) {
		 System.out.println(phno+"\n"+phnName+"\n"+male);
	}
	private void phone(long imeiNo,float radiation) {
		 System.out.println(imeiNo+"\n"+radiation);
	}
	 public static void main(String[] args) {
		Phone c=new Phone();
		c.phone(11225);
		c.phone("android");
		c.phone(2544,"redmi",'m');
		c.phone(123364223l, 32566.36542f);
		
		
		
		
	}
}
