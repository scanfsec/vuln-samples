// A02 - Cryptographic Failures. VULN: DES + static IV.
import javax.crypto.*;
import javax.crypto.spec.*;

public class CryptographicFailures {
  private static final byte[] KEY = "12345678".getBytes(); // VULN: weak key

  public static byte[] encrypt(String plain) throws Exception {
    Cipher c = Cipher.getInstance("DES/ECB/PKCS5Padding"); // VULN: DES + ECB
    c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(KEY, "DES"));
    return c.doFinal(plain.getBytes());
  }
}
