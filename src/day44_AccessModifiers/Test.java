package day44_AccessModifiers;

import static day44_AccessModifiers.Testdata.ID;

import java.util.Arrays;

//import static day44_AccessModifiers.Testdata.Name;
//					packagename    classname.staticName
 
import static day44_AccessModifiers.Testdata.*;

 
public class Test {
	public static String Name ="Muhtar";
	//public static int ID=16;
	public static void main(String[] args) {
		defaultAccessModifer obj = new defaultAccessModifer();
		System.out.println( obj.namePublic);
	//	System.out.println( obj.namePrivate); // private access modifier is not visible outside the class
		System.out.println( obj.nameDefault); // default ACCESS MODIFIER IS VISIBLE IN THE SAME PACKAGE
		
		
		System.out.println( Name );
		System.out.println(Testdata.Name);
		System.out.println( ID );
		System.out.println( SchoolName);
		
		
		
		printHello();
		
		System.out.println(age);
		
		
		
	}

}
