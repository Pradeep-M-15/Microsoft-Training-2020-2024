import java.util.Scanner;
public class modeProgram {
    static int mode(int[] arr,int N){
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < N; ++i) {
            int count = 0;
            for (int j = 0; j < N; ++j) {
                if (arr[j] == arr[i])
                ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Mode is:"+mode(arr,N));
        sc.close();
    }
}
