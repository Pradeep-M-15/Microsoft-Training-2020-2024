import java.util.Scanner;
public class myAtoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i =0;
        boolean neg = false;
        int num =0;
        while(s.length()>i && s.charAt(i)==' '){
         i++;
        }
        if(s.length()>i && s.charAt(i)=='+'){
            i++;
        }
         else if(s.length()>i && s.charAt(i)=='-'){
            i++;
            neg=true;
        }
        
        while(s.length()>i&&Character.isDigit(s.charAt(i))){
            int nu = s.charAt(i)-'0';
            
            if(num>(Integer.MAX_VALUE-nu)/10){ //(num*10)+nu<Integer.MAX_VALUE to check if on changing to number the number crosses MAX_VALUE it should return the range of integer.
                if(neg){
                    System.out.print(Integer.MIN_VALUE);
                }else{
                    System.out.print(Integer.MAX_VALUE);
                }
            }
            
            num= (num*10)+nu;
            i++;
            
        }
        if(num==0) System.out.print("0");
        
        if(neg){
            System.out.print(-1*num);
        }else{
            System.out.print(num);
        }
        sc.close();
    }
}