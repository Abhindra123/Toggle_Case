import java.util.Scanner;

public class Togglecase {
    public static char [] toggleCase(String str){
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            arr[i] ^= 32;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str =sc.nextLine();
        char arr[]=toggleCase(str);
       /// String ns=toggleCase(str);
         String ans=new String(arr);
        System.out.println(ans);
    }
}