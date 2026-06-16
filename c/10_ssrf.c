/* A10 - SSRF-ish in native code. VULN: curl to user URL without validation. */
#include <stdio.h>
#include <stdlib.h>

/* VULN: A10 - passes URL to curl via system() */
void fetch_url(const char *url) {
  char cmd[512];
  snprintf(cmd, sizeof(cmd), "curl -s '%s'", url);
  system(cmd); /* command injection + SSRF */
}
