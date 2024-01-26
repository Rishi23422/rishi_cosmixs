package BasicUtilities;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteProperties{
    public static void main(String[] args) {
        
        Properties prop = new Properties();
        OutputStream writeFile = null;

        try {
            writeFile = new FileOutputStream("config.properties");
            
            prop.setProperty("DBServer", "dbserver1.example.org");
            prop.setProperty("DBName", "db_rishi");
            prop.setProperty("DBPass", "p@ssw0rd");
            prop.setProperty("username", "root");

            prop.store(writeFile, null);
            System.out.println("config.properties file created successfully");

        } catch (IOException io) {
            io.printStackTrace();
        } finally{
            if(writeFile != null){
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}