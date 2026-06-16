/* A07 - Auth Failures. VULN: strcmp timing leak + no lockout. */
#include <string.h>

const char *ADMIN_PASS = "admin"; /* VULN: A07 plaintext */

int authenticate(const char *user, const char *pass) {
  if (strcmp(user, "admin") == 0 && strcmp(pass, ADMIN_PASS) == 0)
    return 1;
  return 0;
}
