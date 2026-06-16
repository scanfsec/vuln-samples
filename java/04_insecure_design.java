// A04 - Insecure Design. VULN: password reset token is user id.
public class InsecureDesign {
  // VULN: A04 - predictable reset token
  public static String issueResetToken(long userId) {
    return Long.toHexString(userId);
  }

  public static boolean resetPassword(String token, String newPassword) {
    long userId = Long.parseLong(token, 16);
    // apply password without email verification
    return userId > 0;
  }
}
