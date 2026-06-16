"""A10 - SSRF. VULN: fetches arbitrary URL from user input."""
import urllib.request

# VULN: A10 - SSRF, no URL allowlist
def fetch_preview(url: str) -> bytes:
    return urllib.request.urlopen(url).read()
