import java.util.Scanner;
public class concatenationOfArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int len = nums.length;
        int[] res = new int[2*len];
        for(int i=0;i<len;i++){
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        System.out.print(res);
        sc.close();
    }
}