/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class CipherTest {

    /**
     * @param args the command line arguments
     */
    Scanner input = new Scanner(System.in);
    String defaultMsg = "Here is some text since you didnt supply any, this will be ciphered... \n the quick brown fox jumps over the lazy dog";

    public void CaeserCipherTest() {
        Cipher secret = new CaesarCipher();
        int key = 0;
        String cipherTxt = "";
        String originalTxt = "";

        log("Enter some text to cipher:");
        originalTxt = input.nextLine();
        if (originalTxt.isEmpty()) {
            originalTxt = defaultMsg;
        }
        log("You entered:\n " + originalTxt);

        cipherTxt = secret.Cipher(originalTxt);
        log("\nCipher key: " + secret.getKey() + "\n Cipher text: " + cipherTxt);

        //log("\n Deciphered text using the key (key:" + secret.getKey() + ")\n *"+ secret.Decipher(cipherTxt, secret.getKey()));

        int badKey = (int) (Math.random() * 100);
        log("\nDecoding with a bad key: " + badKey);
        log(secret.Decipher(cipherTxt, String.valueOf(badKey)));
        log("\n Caeser Test1 done\n\n");
    }

    public void CaeserCipherTest2() {
        Cipher secret = new CaesarCipher();
        int key = 0;
        String cipherTxt = "";
        String originalTxt = defaultMsg;

        cipherTxt = secret.Cipher(originalTxt);
        log("Rember this key: " + secret.getKey() + "\n Cipher message: " + cipherTxt);

        log("\nEnter a the key to decipher: ");
        key = input.nextInt();

        log("Deciphered message: \n" + secret.Decipher(cipherTxt, String.valueOf(key)));
        log("\n Caeser Test2 done\n\n ");
    }

    public void SubstitutionTest() {
        Cipher secret = new SubstitutionCipher();
        SubstitutionCipher secretCipher = new SubstitutionCipher();

        String cipherTxt = "";
        String originalTxt = "";
        String key = "";
        String myKey = "[52]"
                + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "qwerayuioplkjhgfdstzxcvbnmMNBVCLZSKJHGFDXAPOIUYTREWQ";

        log("Enter some text to encrypt");
        originalTxt = input.nextLine();
        if (originalTxt.isEmpty()) {
            originalTxt = defaultMsg;
        }
        log("Entered text:\n" + originalTxt);

        cipherTxt = secret.Cipher(originalTxt);
        log("\nCipher key: \n" + secret.getKey()
                + "\nCipher text:\n * " + cipherTxt);

        log("\nDeciphered text using the cipher key (key:" + secret.getKey() + " )\n *"
                + secret.Decrypt(cipherTxt));

        log("\nDecoding with a bad key: " + myKey);
        log(secret.Decipher(cipherTxt, myKey));
        log("\n Test1 done");

// sc.setAlphaSet(goodSet);
        //sc.setCodexSet(badSet);
    }

    private void log(String txt) {
        System.out.println(txt);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CipherTest ct = new CipherTest();
        ct.CaeserCipherTest();
        ct.CaeserCipherTest2();
        ct.SubstitutionTest();
    }

}
