package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.SaleVO;

public interface SaleService {

	public void addSale(SaleVO sale) throws Exception;
	public List<SaleVO> readSaleList() throws Exception;

	public void updateSale(SaleVO sale) throws Exception;
	public String createCarNum() throws Exception;
}
