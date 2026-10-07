package ifgram.dto;

import ifgram.model.User;

public record UserResponse(Long Id, String Nome, String Email) {
  public static UserResponse from(User user) {
      return new UserResponse(user.getId(), user.getNome(), user.getEmail());

  }

  }