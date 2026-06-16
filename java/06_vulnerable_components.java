// A06 - Vulnerable Components. VULN: outdated dependency versions in pom snippet.
/*
 * VULN: A06 - known CVEs in these versions
 * <dependency>
 *   <groupId>org.apache.logging.log4j</groupId>
 *   <artifactId>log4j-core</artifactId>
 *   <version>2.14.0</version>
 * </dependency>
 * <dependency>
 *   <groupId>com.fasterxml.jackson.core</groupId>
 *   <artifactId>jackson-databind</artifactId>
 *   <version>2.9.8</version>
 * </dependency>
 */
public class VulnerableComponents {}
