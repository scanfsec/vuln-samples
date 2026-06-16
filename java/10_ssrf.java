// A10 - SSRF. VULN: HttpURLConnection to user URL.
import java.net.*;
import java.io.*;

public class Ssrf {
  public static String fetch(String url) throws IOException {
    // VULN: A10 - no blocklist for metadata IPs
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    try (BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = r.readLine()) != null) sb.append(line);
      return sb.toString();
    }
  }
}
