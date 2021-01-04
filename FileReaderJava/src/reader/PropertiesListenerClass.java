package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesListenerClass {

	public static void main(String[] args) throws IOException{
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("./myFiles.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("password"));

	}

}
