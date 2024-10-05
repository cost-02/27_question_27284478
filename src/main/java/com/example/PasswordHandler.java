package com.example;

import java.util.Arrays;

public class PasswordHandler {

    public static void handlePassword(char[] password) {
        // Simula l'uso della password
        System.out.println("Password processed: " + new String(password));
        
        // Pulizia dell'array di caratteri dopo l'uso
        Arrays.fill(password, '0');
    }

    public static void main(String[] args) {
        char[] password = "super_password".toCharArray();
        handlePassword(password);
        // Verifica che la password sia stata cancellata
        System.out.println("Password after cleanup: " + Arrays.toString(password));
    }
}