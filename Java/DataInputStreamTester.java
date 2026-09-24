import java.io.*;

public class DataInputStreamTester {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(
                new FileInputStream("data.dat")
            );

            String name = dis.readUTF();
            int roll = dis.readInt();
            double fees = dis.readDouble();
            boolean isActive = dis.readBoolean();

            System.out.println("Name: " + name);
            System.out.println("Roll: " + roll);
            System.out.println("Fees: " + fees);
            System.out.println("IsActive: " + isActive);

            dis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}