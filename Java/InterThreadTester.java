class Company {
    private int count, item, racksize;

    public Company(int size) {
        racksize = size;
        count = 0;
        item = 1;
    }

    public synchronized void generateMobile() {
        try {
            while (count == racksize) {  
                wait();
            }

            count++;
            Thread.sleep(100);
            System.out.println("item " + item + " generated");
            item++;

            notify(); 
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public synchronized void wrapMobile() {
        try {
            while (count == 0) {
                wait();
            }

            int id = rack[--count];
            Thread.sleep(100);
            System.out.println("item " + id + " wrapped by");

            notify();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class InterThreadTester {
    public static void main(String[] args) {

        Company company = new Company(5);

        Thread producer = new Thread(() -> {
            while (true) {
                company.generateMobile();
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                company.wrapMobile();
            }
        });

        producer.start();
        consumer.start();
    }
}
public void wrapMobile(){

}