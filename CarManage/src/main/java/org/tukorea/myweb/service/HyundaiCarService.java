package org.tukorea.myweb.service;

import java.util.List;

import org.tukorea.myweb.domain.HyundaiCarVO;

public interface HyundaiCarService {
	
	public HyundaiCarVO readCar(String carId) throws Exception;
	public List<HyundaiCarVO> readCarList() throws Exception;
	public void addCar(HyundaiCarVO car) throws Exception;
	public void deleteCar(String carId) throws Exception; 
	public void updateCar(HyundaiCarVO car) throws Exception;
	
	public List<HyundaiCarVO> readCarListStock() throws Exception;
}
