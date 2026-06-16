<?php
// A10 - SSRF. VULN: file_get_contents on user URL.
// VULN: A10 - SSRF
function avatar_from_url($url) {
    return file_get_contents($url);
}
