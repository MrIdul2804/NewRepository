import java.util.*;
public class ABC {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        for(int i=0;i<num;i=i+2){
            int temp=1;

                for (int j = 0; j < i+1; j++) {
                    System.out.print(temp);
                    System.out.print(" ");
                    temp++;
                }
                System.out.println();

        }
    }

}
/*
*
*          1
*       2  3  4
*    5  6 */