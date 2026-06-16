/* A08 - Integrity Failures. VULN: unchecked function pointer from network. */
typedef void (*handler_t)(void);

/* VULN: A08 - attacker controls fn address */
void dispatch(handler_t fn) {
  fn();
}
