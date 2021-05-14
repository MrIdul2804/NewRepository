import java.util.*;
public class Pattern3 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        printPascal(num);
    }
public static void printPascal(int n){
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k*(i-j)/j;
            }
            System.out.println();
        }
}

}
