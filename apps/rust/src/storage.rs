pub fn run_query(sql: String) {
    // SINK: raw SQL execution passed to database driver.
    db.execute(&sql); // noqa: fixture symbol
}
pub fn run_command(host: String) {
    // SINK: shell command construction.
    std::process::Command::new("sh").arg("-c").arg(format!("ping -c 1 {}", host)).output();
}
pub unsafe fn call_ffi(ptr: *const u8) {
    // SINK/REVIEW: unsafe FFI boundary; inspect pointer validity and lifetime.
    external_consume(ptr);
}
