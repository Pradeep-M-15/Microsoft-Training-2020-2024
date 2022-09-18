import java.util.Scanner;
public class AdditionOfNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float M = sc.nextFloat();
        int N = sc.nextInt();
        float sum = M+N;
        System.out.print(sum);
        sc.close();
    }
}