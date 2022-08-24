package org.tukorea.myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.tukorea.myweb.domain.HyundaiCarVO;
import org.tukorea.myweb.persistence.HyundaiCarDAO;

@Service
@Component
public class HyundaiCarServiceImpl implements HyundaiCarService{

	@Autowired
	private HyundaiCarDAO carDAO;

	public HyundaiCarVO readCar(String carId) throws Exception{
		return carDAO.carRead(carId);
	}

	public List<HyundaiCarVO> readCarList() throws Exception{
		return carDAO.carList();
	}
	
	public List<HyundaiCarVO> readCarListStock() throws Exception{
		return carDAO.carListStock();
	}

	public void addCar(HyundaiCarVO car) throws Exception{
		carDAO.carAdd(car);
	}

	public void deleteCar(String carId) throws Exception{
		carDAO.carDelete(carId);
	}

	public void updateCar(HyundaiCarVO car) throws Exception{
		carDAO.carUpdate(car);
	}
	
}
