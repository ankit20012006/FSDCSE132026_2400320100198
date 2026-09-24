import java.io.FileInputStream;

public class fileInputStreamTeaster {
    public static void main(String[]args){
        FileInputStream fin;
        try{
            fin = new FileInputStream("test.txt");
            System.out.println("size of file"+fin.available());
            int i =fin.read();
            fin.close();
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
    
}
