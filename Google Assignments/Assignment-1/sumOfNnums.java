import java.util.Scanner;

public class sumOfNnums {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = N*(N+1)/2;
    System.out.print(sum);
    sc.close();
   } 
}