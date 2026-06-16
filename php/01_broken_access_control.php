<?php
// A01 - Broken Access Control. VULN: direct object reference on file download.
// VULN: A01 - no auth check
function download_invoice($invoice_id) {
    $path = "/var/invoices/" . $invoice_id . ".pdf";
    return file_get_contents($path);
}
