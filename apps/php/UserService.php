<?php
require_once 'UserRepository.php';
class UserService {
    private $repo;
    public function __construct() { $this->repo = new UserRepository(); }
    public function find($id) {
        return $this->repo->raw("SELECT * FROM users WHERE id = '" . $id . "'");
    }
}
?>
