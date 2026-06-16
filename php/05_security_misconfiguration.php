<?php
// A05 - Security Misconfiguration. VULN: display_errors + world-readable uploads.
// VULN: A05
ini_set('display_errors', '1');
error_reporting(E_ALL);

function save_upload($tmp, $name) {
  $dest = "/var/www/html/uploads/" . $name; // VULN: no extension check
  move_uploaded_file($tmp, $dest);
  chmod($dest, 0777);
}
