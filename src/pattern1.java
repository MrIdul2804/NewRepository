import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);

        int size=(n*2)-1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){

                if(j==i || j==size-i+1){
                    System.out.print(ch);
                }
                System.out.print(" ");


            }
            System.out.println();
        }

    }
}