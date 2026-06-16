// A01 - Broken Access Control. VULN: path traversal via unchecked filename.
import java.io.*;
import java.nio.file.*;

public class BrokenAccessControl {
    // VULN: A01 - reads any file under attacker-controlled name
    public static byte[] downloadFile(String filename) throws IOException {
        Path base = Paths.get("/var/app/uploads");
        Path target = base.resolve(filename); // VULN: no normalize/canonicalize check
        return Files.readAllBytes(target);
    }
}
