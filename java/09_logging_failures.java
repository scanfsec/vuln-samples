// A09 - Logging Failures. VULN: sensitive data in logs, no alerting.
import java.util.logging.*;

public class LoggingFailures {
  private static final Logger LOG = Logger.getLogger("auth");

  public static void onLogin(String user, String password, boolean ok) {
    // VULN: A09 - credentials in log; no security event on failure
    LOG.info("login user=" + user + " pass=" + password + " ok=" + ok);
  }
}
