import java.io.*;
import java.util.Properties;

public class PropertyTester {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileInputStream fin = new FileInputStream("config.properties");
        prop.load(fin);

        System.out.println("User name: " + prop.getProperty("username"));
        System.out.println("Branch: " + prop.getProperty("branch"));
        System.out.println("Section: " + prop.getProperty("section"));
        System.out.println("College: " + prop.getProperty("college"));
        System.out.println("City: " + prop.getProperty("city"));

        prop.setProperty("city", "Ghaziabad");
        prop.setProperty("state", "UP");

        FileOutputStream fout = new FileOutputStream("config.properties");
        prop.store(fout, "Updated Properties");

        fin.close();
        fout.close();
    }
}