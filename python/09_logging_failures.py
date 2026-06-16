"""A09 - Logging Failures. VULN: logs secrets + no security events."""
import logging

log = logging.getLogger("app")

# VULN: A09 - password logged; no failed-login audit
def authenticate(username, password):
    log.info("login attempt user=%s password=%s", username, password)
    return username == "admin" and password == "admin"
