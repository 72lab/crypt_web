package com.morse;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES256Util {

    private static final String ALGORITHM = "AES";

    // Ensure the key is padded or truncated to a length of 16, 24, or 32 characters
    private static String padKey(String key) {
        // Choose the smallest valid length: 16, 24, or 32
        int[] validLengths = {16, 24, 32};
        int length = key.length();

        // Find the first valid length greater than or equal to the key length
        int targetLength = validLengths[0];  // Default to 16 characters
        for (int validLength : validLengths) {
            if (length <= validLength) {
                targetLength = validLength;
                break;
            }
        }

        // Pad or truncate the key to the target length
        StringBuilder paddedKey = new StringBuilder(key);
        while (paddedKey.length() < targetLength) {
            paddedKey.append(" ");  // Pad with spaces or any character of your choice
        }

        // If the key is too long, truncate it to the target length
        if (paddedKey.length() > targetLength) {
            return paddedKey.substring(0, targetLength);
        }

        return paddedKey.toString();
    }

    // Encrypt the text using AES (supports any key length, but pads to 16, 24, or 32 characters)
    public static String encrypt(String text, String key) throws Exception {
        // Pad the key to a valid AES length
        String paddedKey = padKey(key);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(paddedKey.getBytes("UTF-8"), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encrypted = cipher.doFinal(text.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt the text using AES (supports any key length, but pads to 16, 24, or 32 characters)
    public static String decrypt(String encryptedText, String key) throws Exception {
        // Pad the key to a valid AES length
        String paddedKey = padKey(key);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(paddedKey.getBytes("UTF-8"), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decoded = Base64.getDecoder().decode(encryptedText);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted, "UTF-8");
    }
}
