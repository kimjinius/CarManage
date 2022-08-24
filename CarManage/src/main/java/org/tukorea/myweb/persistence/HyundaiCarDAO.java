package org.tukorea.myweb.persistence;

import java.util.List;

import org.tukorea.myweb.domain.HyundaiCarVO;


public interface HyundaiCarDAO {
	
	public HyundaiCarVO carRead(String carId) throws Exception;
	public List<HyundaiCarVO> carList() throws Exception;
	public void carAdd(HyundaiCarVO car) throws Exception;
	public void carDelete(String carId) throws Exception;
	public void carUpdate(HyundaiCarVO car) throws Exception;

	public void carStockDown(Integer carId) throws Exception;
	public List<HyundaiCarVO> carListStock() throws Exception;

}
