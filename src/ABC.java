import java.util.*;
public class ABC {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int temp=1;
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp);
                    System.out.print(" ");
                    temp++;
                }
                System.out.println();
            }

        }
    }

}
/*
*
*          1
*       2  3  4
*    5  6 */