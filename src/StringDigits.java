import java.util.*;
public class StringDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        printState(str1);

        }
        public static void printState(String s){
        boolean b=false;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                  b=true;
             }
             else {
                b=false;
                break;
             }
         }
         if(b){
            System.out.println("Valid Input");
         }
         else{
             System.out.println("Invalid Input");
         }
        }
    }