import java.util.Scanner;
public class isPalindrome {
    static boolean Palindrome(int X){
        String str = String.valueOf(X);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.print(Palindrome(X));
        sc.close();
    }
}
