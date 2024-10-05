package com.example;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionExample {

    public static byte[] encryptPassword(byte[] password) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // Use 256 for stronger encryption
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedPassword = cipher.doFinal(password);
        
        System.out.println("Encrypted Password: " + Arrays.toString(encryptedPassword));
        return encryptedPassword;
    }

    public static void main(String[] args) throws Exception {
        byte[] password = "super_password".getBytes();
        byte[] encryptedPassword = encryptPassword(password);
        // Assume you securely store the encrypted password and the key
    }
}
