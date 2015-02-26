/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import cipher.Cipher;

/**
 *
 * @author Eric
 */
public class CaesarCipher implements Cipher {

    private int shiftKey;

    public CaesarCipher() {
        this.shiftKey = (int) (Math.random() * 100);
    }

    public CaesarCipher(int key) {
        this.shiftKey = key;
    }

    
    @Override
    public String Encrypt(String msg) {
        // Encrypt the ciphers given text using the stored key
        // The cipher text will be returned with the key attached.
        String txt = msg;
        String convertedTxt = "";
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, shiftKey);
        }
        return convertedTxt;
    }

    @Override
    public String Decrypt(String msg) {
        // Decode the given ciphertext using the given key
        // retults are displayed not stored
        String convertedTxt = "";
        String txt = msg;

        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            convertedTxt += shift(letter, -shiftKey);
        }
        return convertedTxt;
    }

    @Override
    public String Cipher(String originalTxt) {
        return Encrypt(originalTxt);
    }

    @Override
    public String Decipher(String cipherTxt, String key) {
        shiftKey = Integer.parseInt(key);
        String tmp = Decrypt(cipherTxt);
        return tmp;

    }

    @Override
    public String getKey() {
        return ""+shiftKey;
    }

    @Override
    public void setKey(String key) {
        shiftKey = Integer.parseInt(key);
    }

    private char shift(char letter, int value) {
        return (char) (letter + value);
    }
}
