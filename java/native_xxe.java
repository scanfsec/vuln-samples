// Native: XML External Entity. VULN: CWE-611
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class NativeXxe {
  public static Document parse(String xml) throws Exception {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    // VULN: external entities enabled
    dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false);
    DocumentBuilder db = dbf.newDocumentBuilder();
    return db.parse(new java.io.ByteArrayInputStream(xml.getBytes()));
  }
}
