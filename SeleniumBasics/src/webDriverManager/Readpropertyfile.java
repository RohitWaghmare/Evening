package webDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String appurl = prop.getProperty("appurl");
		System.out.println(appurl);
	}

}
