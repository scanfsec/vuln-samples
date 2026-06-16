"""A03 - Injection. VULN: SQL injection via string concat."""
# VULN: A03 - SQL injection
def search_users(conn, username):
    query = "SELECT * FROM users WHERE name = '" + username + "'"
    return conn.execute(query)
