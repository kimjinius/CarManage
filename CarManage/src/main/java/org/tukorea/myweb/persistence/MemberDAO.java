package org.tukorea.myweb.persistence;

import java.util.List;

import org.tukorea.myweb.domain.MemberVO;

public interface MemberDAO {

	public MemberVO memberRead(String memberMobile) throws Exception;
	public List<MemberVO> memberList() throws Exception;
	public void memberAdd(MemberVO member) throws Exception;
	public void memberDelete(String memberMobile) throws Exception;
	public void memberUpdate(MemberVO member) throws Exception;
	
	
}
