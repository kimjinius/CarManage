package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.MemberVO;

public interface MemberService {
	
	public List<MemberVO> readMemberList() throws Exception;
	public void addMember(MemberVO member) throws Exception;
	public void deleteMember(String memberMobile) throws Exception; 
	public void updateMember(MemberVO member) throws Exception;
	public MemberVO readMember(String memberMobile) throws Exception;
	
}
