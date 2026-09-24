
import java.util.Scanner;
public class MatricesAdd{
    public static void main(String[] args){
        System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=scanner.nextInt();
        System.out.print("Enter the number of columns:");
        int cols=scanner.nextInt();
        int[][] matrix1=new int[rows][cols];
        int[][] matrix2=new int[rows][cols];
        System.out.println("Enter the elements of the first matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=scanner.nextInt();

            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=scanner.nextInt();     
            }
        }
        int[][] sum=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];       
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");     
            }
            System.out.println();
        }
    }
}
