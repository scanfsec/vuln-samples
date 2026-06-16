"""A04 - Insecure Design. VULN: unlimited coupon reuse / no rate limit."""
# VULN: A04 - business logic flaw: coupon never marked used
used_coupons = set()

def redeem_coupon(code: str, user_id: int) -> bool:
    if code.startswith("SAVE"):
        return True  # VULN: no per-user or global redemption tracking
    return False
