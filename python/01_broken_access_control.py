"""A01 - Broken Access Control. VULN: IDOR via unchecked user_id."""
# VULN: A01 - any caller can read any user's profile by changing user_id
def get_profile(db, user_id, requester_id):
    # missing: if user_id != requester_id and not is_admin(requester_id): deny
    return db.execute(f"SELECT * FROM users WHERE id = {user_id}")
