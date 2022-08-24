package org.tukorea.myweb.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.tukorea.myweb.domain.HyundaiCarVO;

@Repository
@Component
public class HyundaiCarDAOImpl implements HyundaiCarDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.tukorea.myweb.mapper.HyundaicarMapper";
	
	public HyundaiCarVO carRead(String carId) throws Exception {
		HyundaiCarVO vo = sqlSession.selectOne(namespace + ".selectByCarId", carId);
		return vo;
	}

	public List<HyundaiCarVO> carList() throws Exception {
		List<HyundaiCarVO> carlist = new ArrayList<HyundaiCarVO>();
		carlist = sqlSession.selectList(namespace + ".selectCarAll");
		return carlist;
	}
	
	public List<HyundaiCarVO> carListStock() throws Exception{
		List<HyundaiCarVO> carlist = new ArrayList<HyundaiCarVO>();
		carlist = sqlSession.selectList(namespace + ".selectCarStock");
		return carlist;
	}

	public void carAdd(HyundaiCarVO car) throws Exception {
		sqlSession.insert(namespace + ".carInsert", car);
	}

	public void carDelete(String carId) throws Exception{
		sqlSession.delete(namespace + ".carDelete", carId);
	}

	public void carUpdate(HyundaiCarVO car) throws Exception{
		sqlSession.update(namespace + ".carUpdate", car);
	}
	
	public void carStockDown(Integer carId) throws Exception{
		sqlSession.update(namespace + ".carStockDown", carId);
	}

}
