const { getProfile, renderBio } = require("./profileService");
function profileRoute(req, res) {
  const id = req.query.id; // SOURCE: HTTP query
  res.json(getProfile(id));
}
function bioRoute(req, res) {
  const bio = req.body.bio; // SOURCE: request body
  res.send(renderBio(bio));
}
module.exports = { profileRoute, bioRoute };
