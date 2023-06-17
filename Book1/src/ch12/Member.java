package ch12;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	//해쉬코드 메서트가 회원 아이디를 반환하도록 재정의
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	//compareTo 메서드 재정의, 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교함
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
	}
	
	
}
