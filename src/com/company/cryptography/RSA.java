package com.company.cryptography;

import javax.crypto.Cipher;
import java.io.File;
import java.io.FileOutputStream;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSA {

    public static void main(String[] args) {
        try {
            //Working with string
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);
            KeyPair pair = generator.generateKeyPair();
            PrivateKey privateKey = pair.getPrivate();
            PublicKey publicKey = pair.getPublic();

            //writing secret key to the file
            try (FileOutputStream fos = new FileOutputStream("public.key")) {
                fos.write(publicKey.getEncoded());
            }

            File publicKeyFile = new File("public.key");
            byte[] publicKeyBytes = Files.readAllBytes(publicKeyFile.toPath());

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            keyFactory.generatePublic(publicKeySpec);

            String secretMessage = "Hello Jonson baby";

            Cipher encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] secretMessageBytes = secretMessage.getBytes(StandardCharsets.UTF_8);
            byte[] encryptedMessageBytes = encryptCipher.doFinal(secretMessageBytes);

            String encodedMessage = Base64.getEncoder().encodeToString(encryptedMessageBytes);
            System.out.println("Encoded message: " + encodedMessage);

            Cipher decryptCipher = Cipher.getInstance("RSA");
            decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] decryptedMessageBytes = decryptCipher.doFinal(encryptedMessageBytes);
            String decryptedMessage = new String(decryptedMessageBytes, StandardCharsets.UTF_8);
            System.out.println("Decoded message: " + decryptedMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
