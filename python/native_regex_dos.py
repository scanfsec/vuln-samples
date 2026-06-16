"""Native: ReDoS via catastrophic backtracking. VULN: CWE-1333"""
import re

# VULN: evil regex on attacker input
PATTERN = re.compile(r"^(a+)+$")

def validate_token(token: str) -> bool:
    return bool(PATTERN.match(token))
