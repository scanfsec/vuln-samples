"""Native: shell=True command execution. VULN: CWE-78"""
import subprocess

# VULN: shell metacharacters interpreted
def run_backup(host: str):
    subprocess.call(f"ping -c 1 {host}", shell=True)
