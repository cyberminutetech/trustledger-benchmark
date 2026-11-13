<?php
require_once 'UserService.php';
$id = $_GET['id'] ?? ''; // SOURCE
$service = new UserService();
echo $service->find($id);
$name = $_POST['name'] ?? ''; // SOURCE
include 'templates/profile.php';
?>
