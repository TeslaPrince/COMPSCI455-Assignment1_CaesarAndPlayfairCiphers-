import java.io.*;
import java.util.*;
public class Solution {
  public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public static String decrypt(String cipherText, int shiftKey) {
    cipherText = cipherText.toUpperCase();
    String message = "";
    for (int ii = 0; ii < cipherText.length(); ii++) {
      int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
      int keyVal = (charPosition - shiftKey) % 26;
      if (keyVal < 0) {
        keyVal = ALPHABET.length() + keyVal;
      }
      char replaceVal = ALPHABET.charAt(keyVal);
      message += replaceVal;
    }
    return message;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Choose which type of decryption:\n1. TUZBKXEYKIAXK\n2. TSJLCPYZJCRMZPSRCDMPACYRRYAIQ\n3. Custom Message\n");
    int choice = sc.nextInt();
    switch (choice){
      case 1:
        message = "TUZBKXEYKIAXK";
        break;
      case 2:
        message = "TSJLCPYZJCRMZPSRCDMPACYRRYAIQ";
        break;
      default:
        System.out.println("Enter Custom Message:");
        message = sc.next();
        break;
    }
    for (int i = 0; i < 26; i++){
      key = i;
      System.out.println("\nDecrypted message with shift " + i + ": " + decrypt(message, key));
    }
    if(choice == 1){
      System.out.println("\nExpected Outcome: Shift of 6 NOTVERYSECURE");
    }
    else if(choice == 2){
      System.out.println("\nExpected Outcome: Shift of 24 VULNERABLETOBRUTEFORCEATTACKS");
    }
  }
}
