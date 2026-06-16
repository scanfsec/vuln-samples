/* A01 - Broken Access Control. VULN: symlink race / missing permission check. */
#include <stdio.h>
#include <string.h>

/* VULN: A01 - reads arbitrary path if caller passes ../ */
int read_config(const char *name) {
    char path[256];
    snprintf(path, sizeof(path), "/etc/myapp/%s.conf", name);
    FILE *f = fopen(path, "r");
    if (!f) return -1;
  fclose(f);
  return 0;
}
