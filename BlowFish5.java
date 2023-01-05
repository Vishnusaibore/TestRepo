import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class BlowFish5
{
	public static void main(String[] args) throws Exception 
	{
	
		KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");
		
		SecretKey secretkey = keygenerator.generateKey();
		
		Cipher cipher = Cipher.getInstance("Blowfish");
		
		cipher.init(Cipher.ENCRYPT_MODE, secretkey);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your message: ");
		
		String inputText = sc.nextLine();
		

		byte[] encrypted = cipher.doFinal(inputText.getBytes());
		

		cipher.init(Cipher.DECRYPT_MODE, secretkey);

		byte[] decrypted = cipher.doFinal(encrypted);
		
		System.out.println(
		"\nEncrypted text: " + new String(encrypted) + "\n" +
		"\nDecrypted text: " + new String(decrypted));
		System.exit(0);
	} 
}
