import java.util.*;
public class Permute {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int n=str.length()-1;
        findPermute(str,0,n);
    }
    public static void findPermute(String s, int l, int r){
        if(l==r){
            System.out.println(s);
        }
        else{
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                findPermute(s,l+1,r);
                s=swap(s, l, i);
            }
        }
    }
    public static String swap(String str1, int i, int j ){
        char temp;
        char[] ch=str1.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
}
