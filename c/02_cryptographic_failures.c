/* A02 - Cryptographic Failures. VULN: custom XOR "encryption". */
#include <string.h>

static const char *KEY = "secret"; /* VULN: A02 hardcoded */

void xor_crypt(char *buf, size_t len) {
  for (size_t i = 0; i < len; i++)
    buf[i] ^= KEY[i % strlen(KEY)];
}
