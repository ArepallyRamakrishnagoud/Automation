package genericutilities;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfileutlity {
	public String readdatafrompf(String keystring) throws Throwable{
		FileInputStream fis = new FileInputStream("Iconstant_utility.propertypath");
		Properties p = new Properties();
		p.load(fis);
		String value =p.getProperty(keystring);
		 return value;
		
	}

}
