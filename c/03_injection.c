/* A03 - Injection. VULN: command injection via system(). */
#include <stdlib.h>

/* VULN: A03 - OS command injection */
void ping_host(const char *host) {
  char cmd[256];
  snprintf(cmd, sizeof(cmd), "ping -c 1 %s", host);
  system(cmd); /* VULN: unsanitized host */
}
