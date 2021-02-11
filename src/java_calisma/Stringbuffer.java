package java_calisma;

public class Stringbuffer {
	
	public static void main(String[] args) {
		StringBuffer str2=new StringBuffer("java");
	
	StringBuilder str=new StringBuilder("JAVA");
	
	//str.append("selenium");
       //     str.insert(1, "testNG");
	
	//str.replace(2, 3, "sql");
	
	//str.reverse();
	str.delete(0, 2);
	System.out.println(str);
	System.out.println(str2);

}
}