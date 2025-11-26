package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesfile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("./filee/abc.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty("browser");
		System.out.println(value);
		 p.setProperty("browser", "efgh");
	}

}
