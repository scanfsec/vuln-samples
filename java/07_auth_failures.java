// A07 - Auth Failures. VULN: missing MFA, long-lived JWT without verify.
import java.util.Base64;

public class AuthFailures {
  public static String mintToken(String username) {
    String payload = "{\"sub\":\"" + username + "\",\"admin\":true}"; // VULN: trust client claims
    return Base64.getEncoder().encodeToString(payload.getBytes());
  }

  public static boolean verify(String token) {
    return token != null && token.length() > 10; // VULN: no signature check
  }
}
