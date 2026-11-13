use crate::service;
pub fn user_route(query_id: String) {
    // SOURCE: HTTP query parameter represented as route input.
    service::get_user(query_id);
}
pub fn ping_route(host: String) {
    // SOURCE
    service::ping(host);
}
