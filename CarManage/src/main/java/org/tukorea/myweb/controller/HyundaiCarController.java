package org.tukorea.myweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tukorea.myweb.domain.HyundaiCarVO;
import org.tukorea.myweb.service.HyundaiCarService;

@Controller
@RequestMapping(value = "/car")
public class HyundaiCarController {

	private static final Logger logger = LoggerFactory.getLogger(HyundaiCarController.class);

	@Autowired(required = true)
	private HyundaiCarService carService;

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String listCar(Model model) throws Exception {
		List<HyundaiCarVO> hyundaicars = carService.readCarList();
		model.addAttribute("hyundaicars", hyundaicars);
		return "hyundaicar/car_list";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readCar(@RequestParam("carid") String id, Model model) throws Exception {
		HyundaiCarVO car = carService.readCar(id);
		model.addAttribute("car", car);
		return "hyundaicar/car_read";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String createCarGet() throws Exception {
		logger.info(" /register URL GET method called. then forward car_register.jsp.");
		return "hyundaicar/car_register";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String createCarPost(@ModelAttribute("hyundaicar") HyundaiCarVO vo) throws Exception {
		carService.addCar(vo);
		logger.info(vo.toString());
		logger.info(" /register URL POST method called. then addCar method executed.");
		return "redirect:/car/list";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyCarGet(@RequestParam("carid") String carId, Model model) throws Exception {
		HyundaiCarVO car = carService.readCar(carId);
		model.addAttribute("car", car);
		return "hyundaicar/car_modify";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyCarPost(@ModelAttribute("car") HyundaiCarVO vo) throws Exception {
		carService.updateCar(vo);
		logger.info(vo.toString());
		return "redirect:/car/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteCarDelete(@RequestParam("carid") String carId, Model model) throws Exception {
		carService.deleteCar(carId);
		return "redirect:/car/list";
	}

}
