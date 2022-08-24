package org.tukorea.myweb.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.tukorea.myweb.domain.MemberVO;

@Repository
@Component
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.tukorea.myweb.mapper.memberMapper";
	
	
	public MemberVO memberRead(String memberMobile) throws Exception{
		MemberVO vo = sqlSession.selectOne(namespace + ".selectByMemberId", memberMobile);
		return vo;
	}
	
	public List<MemberVO> memberList() throws Exception{
		List<MemberVO> memberlist = new ArrayList<MemberVO>();
		memberlist = sqlSession.selectList(namespace + ".selectMemberAll");
		return memberlist;
	}

	public void memberAdd(MemberVO member) throws Exception{
		sqlSession.insert(namespace + ".memberInsert", member);
	}

	public void memberDelete(String memberMobile) throws Exception{
		sqlSession.delete(namespace + ".memberDelete", memberMobile);
	}

	public void memberUpdate(MemberVO member) throws Exception{
		sqlSession.update(namespace + ".memberUpdate", member);
	}

}
