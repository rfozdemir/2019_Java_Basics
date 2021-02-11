package day46_SuperKeyword;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.w3c.dom.ls.LSOutput;

class A {
	
	String name = "Madina";
	
	public void methodA() {
		System.out.println("instance method A");
	}
	
	
	public A ( int a ) {
		System.out.println("super constructor");
		
	}
	
}


public class SuperKeyWord extends A {
		//      sub               super
	
	public SuperKeyWord() {
		super(10);  // super class' constructor MUST be called in the sub class
		 }
		  	
	
	/*
	 	String name  = "Madina";
	 */
	
	public void method() {
		super.name = "Mahir";
		this.name = "Ihsan";
		super.methodA();
		this.methodA();
	}

	public static void main(String[] args) {

		SuperKeyWord obj=new SuperKeyWord() ;

        obj.method();


	}
	
	
}
