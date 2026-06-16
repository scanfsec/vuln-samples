"""A08 - Integrity Failures. VULN: pickle deserialization of untrusted data."""
import pickle

# VULN: A08 - unsafe deserialization
def load_user_prefs(blob: bytes):
    return pickle.loads(blob)
