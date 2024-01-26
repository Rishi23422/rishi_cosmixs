package BasicUtilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {

        Properties prop = new Properties();
        InputStream readFile = null;

        try {
            readFile = new FileInputStream("config.properties");
            prop.load(readFile);

            System.out.println("DB Server: " + prop.getProperty("DBServer"));
            System.out.println("DB Name: " + prop.getProperty("DBName"));
            System.out.println("DB Password: " + prop.getProperty("DBPass"));
            System.out.println("UserName: " + prop.getProperty("username"));
        } catch(IOException io){
            io.printStackTrace();
        } finally{
            if (readFile != null) {
                try {
                    readFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
