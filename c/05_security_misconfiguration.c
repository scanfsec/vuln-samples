/* A05 - Security Misconfiguration. VULN: debug symbols, permissive umask. */
#include <sys/stat.h>

void init_server(void) {
  umask(0); /* VULN: A05 world-writable files */
#ifdef DEBUG
  setenv("LD_LIBRARY_PATH", ".", 1); /* VULN: hijack */
#endif
}
