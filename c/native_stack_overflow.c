/* Native: stack buffer overflow. VULN: CWE-121 */
#include <stdio.h>
#include <string.h>

/* VULN: classic stack smash via gets/strcpy */
void greet_user(void) {
  char name[64];
  gets(name); /* VULN: unbounded read onto stack */
  printf("Hello %s\n", name);
}

void copy_token(const char *token) {
  char buf[16];
  strcpy(buf, token); /* VULN: stack overflow */
}
