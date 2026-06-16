/* Native: integer overflow → heap overflow. VULN: CWE-190 */
#include <stdlib.h>
#include <stdint.h>
#include <string.h>

/* VULN: count * elem_size wraps, malloc too small */
char *alloc_array(unsigned count, unsigned elem_size) {
  size_t total = count * elem_size; /* VULN: integer overflow */
  char *p = malloc(total);
  if (p) memset(p, 0, (size_t)count * elem_size);
  return p;
}
