package java_calisma;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyread {
	
	
	public static void main(String[] args) {
		
		
		
		String path="C:\\Users\\USER\\eclipse-workspace\\Summer2019-Java\\Summer2019_Java\\TestData.properties";
		
		
		
		System.out.println(getData("Name", path));
			
	}
	
	
	public static String getData(String Key, String Path) {
		
		String data="";
		
		Properties property=new Properties();
		
		
		try {
		
		FileInputStream file=new FileInputStream(Path);
		
		
		property.load(file);
		}
		catch(Exception e) {
			
		}
		
		data=property.getProperty(Key);
					
		
		
	return data;	
		
	}
	
	
	

}
