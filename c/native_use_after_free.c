/* Native: use-after-free. VULN: CWE-416 */
#include <stdlib.h>
#include <stdio.h>

/* VULN: dangling pointer dereference */
void log_message(char *msg) {
  free(msg);
  printf("%s\n", msg); /* VULN: UAF */
}
