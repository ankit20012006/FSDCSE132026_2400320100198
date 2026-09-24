public class Company{
    private int count,itemNo,racksize;
     public Company(int size){
        racksize=size;
       count=0;
       itemNo=1;
     }
     public void generateMobile(){
            try {
                 while (count == racksize) {
                wait();}
                count++;
                Thread.sleep(1000);
                System.out.println("Mobile " + itemNo + " is generated");
                itemNo++;
                notify();
            } catch (Exception e) {
            System.out.println(e.getMessage());

            }