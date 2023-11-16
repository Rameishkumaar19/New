package org.classey;

public class Ladderstatement {

	
	public static void main(String[] args) {
		
		int a=20,b=30,c=40;
		
		if (a<b || a>c) {
			System.out.println("a is crct");
		}
		else if (b>a || b<c) {
			System.out.println("b is crct");
		}
		else {
			System.out.println("c is crct");
		}
	}
}
