require_relative "user_repository"
class UserService
  def find(id)
    UserRepository.new.raw("SELECT * FROM users WHERE id = '#{id}'")
  end
  def update_profile(input)
    UserRepository.new.update_all(input)
  end
end
