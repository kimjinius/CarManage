package org.tukorea.myweb.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.tukorea.myweb.domain.SaleVO;

@Repository
@Component
public class SaleDAOImpl implements SaleDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.tukorea.myweb.mapper.saleMapper";
	
	
	public List<SaleVO> saleList() throws Exception{
		return sqlSession.selectList(namespace + ".selectSaleAll");
	}
	
	
	public void saleAdd(SaleVO salelist) throws Exception{
		sqlSession.insert(namespace + ".saleInsert", salelist);
	}
	
	public void saleUpdate(SaleVO sale) throws Exception{
		sqlSession.update(namespace + ".saleCarNumUpdate", sale);
	}
}
