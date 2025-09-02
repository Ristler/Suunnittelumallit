package Decorator;
import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGen.generateKey();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(text.getBytes());
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted: " + encryptedText);

        } catch (NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException |
                 InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        super.print(text);
    }
}
