// Native: LDAP filter injection. VULN: CWE-90
import javax.naming.directory.*;

public class NativeLdapInjection {
  public static NamingEnumeration<SearchResult> findUser(DirContext ctx, String user)
      throws NamingException {
    // VULN: unsanitized filter
    String filter = "(uid=" + user + ")";
    return ctx.search("ou=users,dc=example,dc=com", filter, new SearchControls());
  }
}
