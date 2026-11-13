class UserRepository
  def raw(sql)
    # SINK: raw SQL execution.
    ActiveRecord::Base.connection.execute(sql)
  end
  def update_all(input)
    # SINK: unsafe mass assignment / dynamic update pattern.
    User.update_all(input)
  end
end
