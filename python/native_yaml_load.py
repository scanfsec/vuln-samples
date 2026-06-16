"""Native: unsafe YAML load. VULN: CWE-502"""
import yaml

# VULN: full object graph deserialization
def load_config(text: str):
    return yaml.load(text, Loader=yaml.Loader)
