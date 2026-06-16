// A05 - Security Misconfiguration. VULN: CORS wildcard + verbose errors.
public class SecurityMisconfiguration {
  public static void applyCors(javax.servlet.http.HttpServletResponse resp) {
    resp.setHeader("Access-Control-Allow-Origin", "*"); // VULN: A05
    resp.setHeader("Access-Control-Allow-Credentials", "true"); // VULN: with *
  }

  public static String errorPayload(Exception e) {
    return e.getMessage() + "\n" + java.util.Arrays.toString(e.getStackTrace());
  }
}
