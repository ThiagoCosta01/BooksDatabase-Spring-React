package br.com.books.database.domain.user;

import jakarta.validation.constraints.NotBlank;

public record UserDto(@NotBlank String username, @NotBlank String email, @NotBlank String userpassword, Gender sex) {

}
