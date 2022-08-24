package org.tukorea.myweb.service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.tukorea.myweb.domain.SaleVO;
import org.tukorea.myweb.persistence.HyundaiCarDAO;
import org.tukorea.myweb.persistence.SaleDAO;

@Service
@Component
public class SaleServiceImpl implements SaleService {

	@Autowired
	private HyundaiCarDAO carDAO;

	@Autowired
	private SaleDAO saleDAO;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 10)
	public void addSale(SaleVO sale) throws Exception {
		carDAO.carStockDown(sale.getSaleCarId());
		saleDAO.saleAdd(sale);
	}
	
	public String createCarNum() throws Exception{
		Random rand = new Random();
		String[] al = {"가","나","다","라","마","바","사","아","자","차","카","타","파","하"};
		int aValue = rand.nextInt(14);
		int fValue = ThreadLocalRandom.current().nextInt(10, 100);
		int lValue = ThreadLocalRandom.current().nextInt(1000, 10000);
		String carNumber = Integer.toString(fValue) + al[aValue] + Integer.toString(lValue);
		return carNumber;
	}
	
	

	public List<SaleVO> readSaleList() throws Exception {
		return saleDAO.saleList();
	}
	
	public void updateSale(SaleVO sale) throws Exception{
		saleDAO.saleUpdate(sale);
	}
	


}
