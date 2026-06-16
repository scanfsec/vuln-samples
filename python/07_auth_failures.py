"""A07 - Auth Failures. VULN: no lockout, weak session token."""
import random

# VULN: A07 - predictable session ID
def create_session(user_id: int) -> str:
    return f"sess_{user_id}_{random.randint(1000, 9999)}"

def login(db, username, password):
    user = db.find_user(username)
    if user and user.password == password:  # VULN: plaintext compare
        return create_session(user.id)
    return None
