package org.tukorea.myweb.domain;

public class MemberVO {

	   private String memberMobile;
	   private String memberName;
	   private String memberDivision;
	   private String memberEmail;
	public String getMemberMobile() {
		return memberMobile;
	}
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberDivision() {
		return memberDivision;
	}
	public void setMemberDivision(String memberDivision) {
		this.memberDivision = memberDivision;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	@Override
	public String toString() {
		return "MemberVO [memberMobile=" + memberMobile + ", memberName=" + memberName + ", memberDivision="
				+ memberDivision + ", memberEmail=" + memberEmail + "]";
	}
}
