const { rawLookup } = require("./query");
function getProfile(id) {
  return rawLookup("SELECT * FROM profiles WHERE id = " + id);
}
function renderBio(bio) {
  // SINK: server-side HTML response; unescaped user content.
  return "<section>" + bio + "</section>";
}
function mergePreferences(target, input) {
  // SINK: prototype pollution pattern.
  for (const key of Object.keys(input)) target[key] = input[key];
  return target;
}
module.exports = { getProfile, renderBio, mergePreferences };
