"""A05 - Security Misconfiguration. VULN: debug mode + exposed stack traces."""
import os

# VULN: A05 - debug enabled in production
DEBUG = os.getenv("DEBUG", "true").lower() == "true"

def handle_error(exc):
    if DEBUG:
        return {"error": str(exc), "traceback": __import__("traceback").format_exc()}
    return {"error": "internal"}
