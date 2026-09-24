import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTester {
    public static void main(String[] args) {
        DataOutputStream dis;
        try {
            dis = new DataOutputStream(
                    new FileOutputStream("data.dat"));
            dis.writeInt(1001);
            dis.writeBoolean(false);
            dis.writeFloat(250000.50f);
            dis.writeUTF("Rameshwar Tripathi");
            dis.close();
            System.out.println("File is written");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}