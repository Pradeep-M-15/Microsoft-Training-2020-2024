import java.util.Scanner;
public class factProg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0 || N==1) 
            System.out.print("1");
        else{
            int fact = 1;
            for(int i=1;i<=N;i++){
                fact*=i;
            }
            System.out.print(fact);
        }
        sc.close();
    }
}
