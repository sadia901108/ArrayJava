
package basic.anisulvideo2;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        System.out.println("Enter the numbers :");
        for (int i = 0; i < 5; i++) {
            arr[i]=input.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The sum is :"+sum);
        System.out.println("The average is :"+sum/5);
    }
}
