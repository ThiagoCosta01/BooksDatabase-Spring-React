package br.com.books.database.domain.user;


public record UserDto(String username, String email, String userpassword, Gender sex) {

}
