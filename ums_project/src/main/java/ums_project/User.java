package ums_project;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@Column(unique = true, nullable = false)
	private Long phono;
	
	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Integer id, String name, Long phono, String username, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phono = phono;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User(String name, Long phono, String username, String email, String password) {
		super();
		this.name = name;
		this.phono = phono;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phono=" + phono + ", username=" + username + ", email=" + email
				+ ", password=" + password + "]\n";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhono() {
		return phono;
	}
	public void setPhono(Long phono) {
		this.phono = phono;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}