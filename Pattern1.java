import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number ");
        //int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp++);
            }
            temp -=2;
            for(int j=1;j<i;j++){
                System.out.print(temp--);
            }
            
            System.out.println();
        }
        
    }
}
