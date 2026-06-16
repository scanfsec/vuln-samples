// Native: JNDI lookup injection. VULN: CWE-917
import javax.naming.*;

public class NativeJndiInjection {
  public static Object lookup(String name) throws NamingException {
    InitialContext ctx = new InitialContext();
    // VULN: attacker-controlled JNDI name → remote class loading
    return ctx.lookup(name);
  }
}
