import java.util.Scanner;
public class lcmProg {
    static int findGCD(int X,int Y){
        if(X==0) return Y;
        else{
            return findGCD(Y%X,X);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = findGCD(X,Y);
        int LCM = X*Y/ans;
        System.out.print(LCM);
        sc.close();
    }
}
