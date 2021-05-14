import java.util.*;
public class Rotation{
    public static void main(String[] args){
        String str1, str2;
        String temp;
        Scanner sc= new Scanner(System.in);

        str1=sc.nextLine();
        str2=sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("The two Strings cannot be rotations of each other. ");
        }
        else{
            temp=str1+str1;
            if(temp.contains(str2)){
                System.out.println("Strings are rotation of each other.");
            }
            else
                System.out.println("Strings are not a rotation of each other.");
        }
    }
}