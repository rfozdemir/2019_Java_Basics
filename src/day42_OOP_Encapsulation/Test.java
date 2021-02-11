package day42_OOP_Encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		TestData obj = new TestData();
		//	System.out.println( obj.Name );	// the data was private
			
		System.out.println( obj.getName() );  
		
		String str = obj.getName(); 
		
		// System.out.println( obj.ID );  // private data
		System.out.println( obj.getID() );  //
			int a = obj.getID();
			
	
			
	// modify
		//	obj.Name = "Nurzat";	
			obj.setName("Muhtar");
			
		//	System.out.println( obj.Name );
			System.out.println(obj.getName());
			
			obj.setID( 400 );
		//	System.out.println( obj.ID );
			System.out.println( obj.getID() ); 
			
			
		
		
	}

}
