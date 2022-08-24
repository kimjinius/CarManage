package org.tukorea.myweb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.persistence.MemberDAO;

@Service
@Component
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDAO;
	
	public List<MemberVO> readMemberList() throws Exception{
		return memberDAO.memberList();
	}

	public void addMember(MemberVO member) throws Exception{
		memberDAO.memberAdd(member);
	}

	public void deleteMember(String memberMobile) throws Exception{
		memberDAO.memberDelete(memberMobile);
	}

	public void updateMember(MemberVO member) throws Exception{
		memberDAO.memberUpdate(member);
	}
	
	public MemberVO readMember(String memberMobile) throws Exception{
		return memberDAO.memberRead(memberMobile);
	}
}
