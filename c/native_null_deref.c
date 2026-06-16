/* Native: NULL pointer dereference. VULN: CWE-476 */
#include <stdio.h>
#include <string.h>

/* VULN: missing null check before deref */
int parse_header(const char *hdr) {
  if (hdr[0] == 'X') /* VULN: hdr may be NULL */
    return hdr[1];
  return 0;
}

void print_len(const char *s) {
  printf("%zu\n", strlen(s)); /* VULN: strlen(NULL) */
}
