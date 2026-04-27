package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesfile {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("./prop.properties");
        Properties p = new Properties();
        p.load(fis);

        String value = p.getProperty("browser");
        System.out.println(value);

        // Update value
        p.setProperty("browser", "efgh");

        // Save to file
        FileOutputStream fos = new FileOutputStream("./prop.properties");
        p.store(fos, "Updated browser value");

        String value1 = p.getProperty("browser");
        System.out.println(value1);
    }
}
