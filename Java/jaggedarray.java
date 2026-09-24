import java utlis.io
public class jaggedarray{
    public static void main(String[] args){
        System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");
        int [][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] =new int[3];
        jaggedArray[2] = new int[4];
        int count =1;
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                jaggedArray[i][j]=count++;
            }
        }
        
        System.out.println("The jagged array is:");
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println(); 
        }
    }
}
