import java.util.*;
public class areaOfTraingle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float S = (A+B+C)/2;
        double area = Math.sqrt(S*(S-A)*(S-B)*(S-C));
        System.out.print(area);
        sc.close();
    }
}
