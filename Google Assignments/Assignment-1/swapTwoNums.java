import java.util.Scanner;
public class swapTwoNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.print("The value of A is:"+A+"\n");
        System.out.print("The value of B is:"+B);
        sc.close();
    }
}
