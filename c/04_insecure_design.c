/* A04 - Insecure Design. VULN: auth bypass via magic backdoor constant. */
#define ADMIN_PIN 0x1337 /* VULN: A04 hardcoded backdoor */

int check_pin(unsigned pin) {
  if (pin == ADMIN_PIN) return 1;
  return 0;
}
