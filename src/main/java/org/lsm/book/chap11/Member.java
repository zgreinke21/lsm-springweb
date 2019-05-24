package org.lsm.book.chap11;


/**
 * p.60 [리스트 3.3] Member 클래스 수정<br>
 * 회원정보 도메인 오브젝트. 회원 테이블과 매핑한다.
 * 
 * @author Jacob
 */
public class Member {
	String memberId; // 아이디
	String email; // 이메일
	String password; // 비밀번호
	String name; // 이름
	String cdate; // 가입일

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * email, password, name 으로 초기화하는 컨스트럭터
	 * 
	 * @param email    이메일
	 * @param password 비밀번호
	 * @param name     이름
	 */
	public Member(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", email=" + email + ", name="
				+ name + ", cdate=" + cdate + "]";
	}
}