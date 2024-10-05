package com.example;

import java.util.Arrays;

public class PasswordByteHandler {

    public static void handlePassword(byte[] password) {
        // Simula l'uso della password
        System.out.println("Password processed: " + Arrays.toString(password));
        
        // Pulizia dell'array di byte dopo l'uso
        Arrays.fill(password, (byte) 0);
    }

    public static void main(String[] args) {
        byte[] password = "super_password".getBytes();
        handlePassword(password);
        // Verifica che la password sia stata cancellata
        System.out.println("Password after cleanup: " + Arrays.toString(password));
    }
}