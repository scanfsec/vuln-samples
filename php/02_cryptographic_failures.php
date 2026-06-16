<?php
// A02 - Cryptographic Failures. VULN: ECB AES + key in source.
// VULN: A02
$key = "0123456789abcdef";
function encrypt_token($plain) {
    global $key;
    return openssl_encrypt($plain, "AES-128-ECB", $key);
}
