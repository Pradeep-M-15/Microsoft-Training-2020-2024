import java.util.Scanner;

public class allDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i=0;i<len;i++){
            System.out.print(str.charAt(i)+" ");
        }
        sc.close();
    }
}
