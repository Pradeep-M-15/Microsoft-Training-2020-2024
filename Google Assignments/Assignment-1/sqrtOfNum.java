import java.util.Scanner;
public class sqrtOfNum {
    static int mySqrt(int x) {
        long start=0;
        long end=x-1;
        long ans=0;
        long mid=start+((end-start)/2);
        if (x==1) return 1;
        while(start<=end)
        {
            if(mid*mid==x) return (int)mid;
            else if(mid*mid<x){
                ans=mid;
                start=mid+1;
                mid=start+((end-start)/2);
            }
            else {
                end=mid-1;
                mid=start+((end-start)/2); 
            }
        }
        return (int)ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(mySqrt(x));
        sc.close();
    }
}