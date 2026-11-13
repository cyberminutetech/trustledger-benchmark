<?php
class UserRepository {
    public function raw($sql) {
        // SINK: SQL execution.
        return mysqli_query($GLOBALS['db'], $sql);
    }
}
?>
