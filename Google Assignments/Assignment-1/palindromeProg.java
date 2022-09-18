import java.util.Scanner;
public class palindromeProg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int left = 0;
        int right = len-1;
        int flag = 0;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=1;
                break;
            }
            left++;
            right--;
        }
        if(flag==1){
            System.out.print("Not Palindrome");
        }
        else{
            System.out.print("Palindrome");
        }
        sc.close();
    }
}
