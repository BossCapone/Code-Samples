/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

/**
 *
 * @author Eric
 */
public interface Cipher {

    //The 4 main functions
    //Encryption takes a mesage and returns an encrypted version of it
    public String Encrypt(String msg);

    public String Decrypt(String msg);

    /*
     Cipher Text
     - Cipher takes a message and returns the encrypted version without the key
     - Decipher takes a ciphered message and unlocks it with a Cipher key returning a new mesage    
     */
    public String Cipher(String originalTxt);

    public String Decipher(String cipherTxt, String key);

    /*
     Cipher Key
     - The cipher key holds the key to a decrypting ciphers 
     - get the key from a cipher or set ot
     */
    public String getKey();

    public void setKey(String key);

}
