<?php
$stmt = $db->prepare("SELECT * FROM users WHERE id = ?");
$stmt->bind_param("s", $id); // NEGATIVE: parameterized query.
?>
