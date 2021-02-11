package day45_Inheritance;

public class Protectd_VS_Default {
	
	public static void main(String[] args) {
		
	}
	
	protected static String name;
			  static String id;
			  
	protected static void printHello() {
		System.out.println("Hello");
	}

	static void printHola() {
		System.out.println("Hola");
	}

}

 class cybertek{
	
	public static void main(String[] args) {
		Protectd_VS_Default obj = new Protectd_VS_Default();
				obj.printHello();
				obj.printHola();
			System.out.println( obj.name );	
			System.out.println( obj.id);
		//Protectd_VS_Default.printHello();
	}
	
}
