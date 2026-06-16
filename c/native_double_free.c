/* Native: double free. VULN: CWE-415 */
#include <stdlib.h>

/* VULN: same pointer freed twice */
void release_buffer(char *p) {
  free(p);
  free(p); /* VULN: double free */
}
