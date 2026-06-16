<?php
// Native: extract() variable overwrite. VULN: CWE-621
// VULN: attacker overwrites $is_admin via GET
function bootstrap() {
    extract($_GET);
    if ($is_admin) {
        grant_admin();
    }
}

function grant_admin() {}
