class UsersController
  def show
    id = params[:id] # SOURCE
    render json: UserService.new.find(id)
  end
  def update
    input = params[:user] # SOURCE
    UserService.new.update_profile(input)
  end
end
