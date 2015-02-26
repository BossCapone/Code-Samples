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
public class SubstitutionCipher implements Cipher {

    public char[] alphaSet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',',','.',' ','?'};
    public char[] codexSet = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'P','O','I','U','Y','T','R','E','W','Q','L','K','J','H','G','F','D','S','A','M','N','B','V','C','X','Z','-',' ','~','/'};
    
    @Override
    public String Encrypt(String msg) {
        if (!isValidKey()) {
            throw new Error("invalid key");
        }

        char cipherText[] = new char[(msg.length())];
        // for the duration of the message, cycle through the characters
        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < alphaSet.length; j++) {
                // for each letter in the alpha set
                // If the if the message char matches the alphaset char code it
                if (alphaSet[j] == msg.charAt(i)) {
                    cipherText[i] = codexSet[j];
                    break;
                }
            }

        }
        return new String(cipherText);

    }

    @Override
    public String Decrypt(String msg) {
        if (isValidKey()) {

            char originalTxt[] = new char[msg.length()];
            for (int i = 0; i < msg.length(); i++) { // for the duration of the message
                for (int j = 0; j < alphaSet.length; j++) { // for each letter
                    // If the coded char matches the codex char, decode it
                    if (msg.charAt(i) == codexSet[j]) {
                        originalTxt[i] = alphaSet[j];
                        break;
                    }
                }
            }
            return new String(originalTxt);
        }

        throw new Error("invalid key");
    }

    @Override
    public String Cipher(String txt) {
        return Encrypt(txt);
    }

    @Override
    public String Decipher(String cipherTxt, String key
    ) {
        setKey(key);
        //System.out.println("newKey: "+new String(codexSet) );
        return Decrypt(cipherTxt);
    }

    @Override
    public String getKey() {
        if (!isValidKey()) {
            return null;
        }
        String tmp = "";
        String alpha = new String(alphaSet);
        String codex = new String(codexSet);
        String header = "[" + alpha.length() + "]";
        tmp = tmp.concat(header);
        tmp = tmp.concat(alpha);
        tmp = tmp.concat(codex);
        //System.out.println(tmp);
        return tmp;
    }

    @Override
    public void setKey(String key) {

        //Extract header from given key and create new key 
        int keySize = 0;
        String newKey = "";
        if (key.charAt(0) == '[') {
            String header = "";
            for (int i = 1; i < key.length(); i++) {
                if (key.charAt(i) == ']') {
                    newKey = key.substring(++i);
                    break;
                }
                header += key.charAt(i);
            }
            keySize = Integer.parseInt(header);
            //log("key= " + newKey);
            //log("keySize=" + keySize);
        }

        // Get alphaset from key
        String alpha = newKey.substring(0, keySize);
        String codex = newKey.substring(keySize);
        //log("alpha= " + alpha);
        //log("codex= " + codex);
        setAlphaSet(alpha.toCharArray());
        setCodexSet(codex.toCharArray());

    }


    /*
     Non interface functions 
     */
    public void setAlphaSet(char[] set) {
        if (isValidSet(set)) {
            alphaSet = set;
        }
    }

    public void setCodexSet(char[] set) {
        if (isValidSet(set)) {
            codexSet = set;
        }
    }

    public void setKey(char[] set1, char[] set2) {
        if (isValidKey(set1, set2)) {
            alphaSet = set1;
            codexSet = set2;
        }
    }

    public void setKey(String alphaKey, String codexKey) {
        // Parse str1 into char arr
        char[] tmp = new char[alphaKey.length()];
        for (int i = 0; i < alphaKey.length(); i++) {
            tmp[i] = alphaKey.charAt(i);
        }
        // Parse str2 into char arr
        char[] tmp2 = new char[codexKey.length()];
        for (int i = 0; i < codexKey.length(); i++) {
            tmp2[i] = codexKey.charAt(i);
        }
        // validate and assign
        if (isValidKey(tmp, tmp2)) {
            alphaSet = tmp;
            codexSet = tmp2;
        }
    }

    // Validate setSize
    private boolean isMatchingSets(char[] text, char[] code) {
        int set1 = new String(text).length();
        int set2 = new String(code).length();
        String msg = "";

        if (set1 < set2) {
            msg = "set1 is less than set2 by " + (set2 - set1);
        }

        if (set1 > set2) {
            msg = "set1 is greater than set2 by " + (set1 - set2);
        }

        if (set1 == set2) {
            return true;
        } else {
            System.out.println(msg);
            return false;
        }
    }

    // Validate set
    private boolean isValidSet(char[] set) {
        // Iterates through a char set to determine if its valid.
        // Invalid sets contain duplicatie chars
        int dCount = 0;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (i == j) {
                    // we are looking at the same char index, skip over
                    break;
                }
                if (set[i] == set[j]) {
                    dCount++;
                }
            }
        }
        if (dCount >= 1) {
            System.out.println("found " + dCount + " duplicates");
        }
        return dCount == 0;
    }

    // Validate local key
    private boolean isValidKey() {
        return isValidSet(alphaSet)
                && isValidSet(codexSet)
                && isMatchingSets(alphaSet, codexSet);
    }

    //Validate given key
    private boolean isValidKey(char[] set1, char[] set2) {
        return isValidSet(set1)
                && isValidSet(set2)
                && isMatchingSets(set1, set2);
    }

}
