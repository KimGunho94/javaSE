package day06.mypac;


/*
 * [[ VO(Value Object), 
 * 		DTO(Data Transfer Object) ]]
 * 	값 오브젝트로써 
 * 	 	목적의 맞는 변수의 집합.
 * 		DataBase 값 운반용으로 사용.
 * 		캡슐화
 * 
 */
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String phoneNumber;
	private String address;
	private String birth;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

}
