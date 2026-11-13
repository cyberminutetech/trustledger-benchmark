use crate::storage;
pub fn get_user(id: String) {
    let sql = format!("SELECT * FROM users WHERE id = '{}'", id);
    storage::run_query(sql);
}
pub fn ping(host: String) {
    storage::run_command(host);
}
