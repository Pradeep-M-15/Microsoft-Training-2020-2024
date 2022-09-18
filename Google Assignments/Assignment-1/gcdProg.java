import java.util.Scanner;
public class gcdProg {
    static int findGCD(int A,int B){
        if(A==0) return B;
        else{
            return findGCD(B%A,A);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.print("GCD is :"+findGCD(A,B));
        sc.close();
    }
}
