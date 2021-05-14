import java.util.*;
public class Patter2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=1;
        if(num<=0){
            System.out.println("Invalid choice");
        }
        for(int i=1;i<=num;i++ ) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <=i*2-1;k++) {
                if (k==1 || k==(2*i-1))
                    System.out.print(temp);
                else
                    System.out.print(" ");
            }
            temp++;

            System.out.println();
        }

        temp=num-1;
        for (int i=num-1;i>=1;i--){
            for(int j=num;j>=1;j--){
                System.out.print(" ");

            }
            for(int k=1;k<2*i-1;k++){
                if(k==1 || k==(2*i)-1)
                    System.out.print(temp);

                    System.out.print(" ");
            }
            temp--;
            System.out.println();
        }
    }

}