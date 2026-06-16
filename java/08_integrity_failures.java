// A08 - Integrity Failures. VULN: Java deserialization without filter.
import java.io.*;

public class IntegrityFailures {
  // VULN: A08 - untrusted ObjectInputStream
  public static Object loadSession(byte[] data) throws Exception {
    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
    return ois.readObject();
  }
}
