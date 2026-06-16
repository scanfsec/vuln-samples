/* Native: heap buffer overflow. VULN: CWE-122 */
#include <stdlib.h>
#include <string.h>

/* VULN: write past heap allocation */
void store_record(const char *data, size_t len) {
  char *buf = malloc(32);
  if (!buf) return;
  memcpy(buf, data, len); /* VULN: len unchecked, heap overflow */
  free(buf);
}
