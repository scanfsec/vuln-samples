/* Native: format string vulnerability. VULN: CWE-134 */
#include <stdio.h>

/* VULN: user controls format specifier */
void audit_log(const char *user_msg) {
  printf(user_msg); /* VULN: %n / %x leak stack */
}

void debug_print(const char *fmt, const char *arg) {
  printf(fmt, arg); /* VULN: attacker supplies fmt */
}
