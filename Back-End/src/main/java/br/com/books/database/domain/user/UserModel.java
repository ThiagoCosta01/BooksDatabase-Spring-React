package br.com.books.database.domain.user;

import java.sql.Timestamp;

import jakarta.persistence.*;

	@Table(name = "tb_user")
	@Entity
	public class UserModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;

		@Column(name = "username", nullable = false, length = 50)
		private String username;

		@Column(name = "email", nullable = false, length = 100)
		private String email;

		@Column(name = "userpassword", nullable = false, length = 255)
		private String userpassword;

		@Enumerated(EnumType.STRING)
		@Column(name = "sex")
		private Gender sex = Gender.valueOf("UNKNOWN");

		@Column(name = "creation_date")
		private Timestamp creationDate;

		
		
		
		public UserModel() {
			
		}

		public UserModel(Long id, String username, String email, String userpassword, Gender sex,
				Timestamp creationDate) {

			this.id = id;
			this.username = username;
			this.email = email;
			this.userpassword = userpassword;
			this.sex = sex;
			this.creationDate = creationDate;
		}
		
		public UserModel(UserDto userDto) {
			
			this.username = userDto.username();
			this.email = userDto.email();
			this.userpassword = userDto.userpassword();
			this.sex = userDto.sex();
			
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserpassword() {
			return userpassword;
		}

		public void setUserpassword(String userpassword) {
			this.userpassword = userpassword;
		}

		public Gender getSex() {
			return sex;
		}

		public void setSex(Gender sex) {
			this.sex = sex;
		}

		public Timestamp getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Timestamp creationDate) {
			this.creationDate = creationDate;
		}
		
		
		
		
	
		
		
}
