"""A06 - Vulnerable Components. VULN: known-vulnerable dependency pin."""
# VULN: A06 - intentionally pins a library version with known CVEs
# requirements snippet — do not pip install in production
REQUIREMENTS = """
Django==2.2.0
Pillow==8.0.0
PyYAML==5.1
"""
