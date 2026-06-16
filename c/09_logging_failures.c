/* A09 - Logging Failures. VULN: sensitive data to syslog, no rotation. */
#include <stdio.h>

void log_secret(const char *api_key) {
  /* VULN: A09 - secrets in logs */
  printf("[INFO] using api_key=%s\n", api_key);
}
