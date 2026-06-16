/* A06 - Vulnerable Components. VULN: bundles old OpenSSL / zlib APIs. */
/*
 * VULN: A06 - links against openssl 1.0.2 (EOL)
 * #include <openssl/ssl.h>
 * SSLv23_client_method();
 */

/* placeholder documenting dependency risk */
void vulnerable_components_note(void) {}
