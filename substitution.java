import java.io.*; 
import java.util.*; 
import java.lang.*; 
public class Main
{
 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) throws IOException
 {
 String a = "abcdefghijklmnopqrstuvwxyz";
 String b = "zyxwvutsrqponmlkjihgfedcba"; 
 System.out.println("Enter any string: ");
 String str = sc.next();
 System.out.println("string is:"+str);
 String decrypt = ""; String encrypt = "";
 char c,d;
 for(int i=0;i<str.length();i++)
 {
 c = str.charAt(i); 
 int j = a.indexOf(c);
 encrypt+= b.charAt(j);
 }
 System.out.println("The encrypted data is: " +encrypt);
 for(int i=0;i<encrypt.length();i++)
 {
 d = encrypt.charAt(i); 
 int j = b.indexOf(d); 
 decrypt+= a.charAt(j);
 }
 System.out.println("The decrypted data is: " +decrypt);
}
}
