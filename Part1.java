import java.io.*;
import java.util.*;
public class Solution {
  public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static String decrypt(String cipherText, int shift) {
    cipherText = cipherText.toUpperCase();
    String plainText = "";
    for (int ii = 0; ii < cipherText.length(); ii++) {
      int position = alpha.indexOf(cipherText.charAt(ii));
      int keyVal = (position - shift) % 26;
      if (keyVal < 0) {
        keyVal = alpha.length() + keyVal;
      }
      char eq = alpha.charAt(keyVal);
      plainText += eq;
    }
    return plainText;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = new String();
    int key = 0;
    System.out.print("Choose which type of decryption:\n1. TUZBKXEYKIAXK\n2. TSJLCPYZJCRMZPSRCDMPACYRRYAIQ\n3. Custom Message\n");
    int choice = sc.nextInt();
    switch (choice){
      case 1:
        text = "TUZBKXEYKIAXK";
        break;
      case 2:
        text = "TSJLCPYZJCRMZPSRCDMPACYRRYAIQ";
        break;
      default:
        System.out.println("Enter Custom Message:");
        text = sc.next();
        break;
    }
    for (int i = 0; i < 26; i++){
      key = i;
      System.out.println("\nDecrypted message with shift " + i + ": " + decrypt(text, key));
    }
    if(choice == 1){
      System.out.println("\nExpected Outcome: Shift of 6 NOTVERYSECURE");
    }
    else if(choice == 2){
      System.out.println("\nExpected Outcome: Shift of 24 VULNERABLETOBRUTEFORCEATTACKS");
    }
    sc.close();
  }
}
