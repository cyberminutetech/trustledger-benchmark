<?php
$next = $_GET['next'] ?? '/'; // SOURCE
header('Location: ' . $next); // SINK: open redirect
?>
