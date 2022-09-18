import java.util.Scanner;
class numberPattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
