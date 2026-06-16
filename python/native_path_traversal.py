"""Native: path traversal in filesystem API. VULN: CWE-22"""
from pathlib import Path

# VULN: user filename not canonicalized
def read_user_file(base_dir: str, name: str) -> bytes:
    path = Path(base_dir) / name
    return path.read_bytes()
