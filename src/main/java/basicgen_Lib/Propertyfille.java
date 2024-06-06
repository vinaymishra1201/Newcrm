package basicgen_Lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfille {
	public String getpropertyfile(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFilepath);
		p.load(fis);
		return p.getProperty(key);
	}
}
