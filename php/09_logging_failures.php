<?php
// A09 - Logging Failures. VULN: logs PII to world-readable file.
// VULN: A09
function log_payment($card, $cvv, $amount) {
    file_put_contents('/tmp/payments.log', "$card,$cvv,$amount\n", FILE_APPEND);
}
