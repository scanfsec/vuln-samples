"""A02 - Cryptographic Failures. VULN: MD5 password + hardcoded key."""
import hashlib

# VULN: A02 - weak hash, no salt
SECRET_KEY = "hardcoded-dev-key-change-me"  # VULN: hardcoded secret

def hash_password(password: str) -> str:
    return hashlib.md5(password.encode()).hexdigest()
