import  java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        findReverse(str);
    }
    public static void findReverse(String s){
        if(s==null || s.length()<=1){
            System.out.println(s);
        }
        else{
            System.out.print(s.charAt(s.length()-1));
            findReverse(s.substring(0,s.length()-1));
        }
    }
}
