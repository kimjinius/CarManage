package org.tukorea.myweb.persistence;

import java.util.List;

import org.tukorea.myweb.domain.SaleVO;


public interface SaleDAO {
	
	public List<SaleVO> saleList() throws Exception;
	public void saleAdd(SaleVO salelist) throws Exception;
	
	public void saleUpdate(SaleVO sale) throws Exception;
}
