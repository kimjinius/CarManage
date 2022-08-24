package org.tukorea.myweb.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tukorea.myweb.domain.HyundaiCarVO;
import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.domain.SaleVO;
import org.tukorea.myweb.service.HyundaiCarService;
import org.tukorea.myweb.service.MemberService;
import org.tukorea.myweb.service.SaleService;

@Controller
@RequestMapping(value = "/sale")
public class SaleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SaleController.class);

	@Autowired(required = true)
	private SaleService saleService;
	
	@Autowired(required = true)
	private HyundaiCarService carService;
	
	@Autowired(required = true)
	private MemberService memberService;
	
	@RequestMapping(value = { "/carlist" }, method = RequestMethod.GET)
	public String SalelistCar(@RequestParam("membermobile") String mobile, Model model, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		session.setAttribute("member", memberService.readMember(mobile));
		List<HyundaiCarVO> hyundaicars = carService.readCarListStock();
		model.addAttribute("hyundaicars", hyundaicars);
		return "sale/car_list";
	}

	@RequestMapping(value = "/carread", method = RequestMethod.GET)
	public String SalereadCar(@RequestParam("carid") String id, Model model) throws Exception {
		HyundaiCarVO car = carService.readCar(id);
		model.addAttribute("car", car);
		return "sale/car_read";
	}
	
	@RequestMapping(value = { "/carsale" }, method = RequestMethod.GET)
	public String createSalelistPost(@RequestParam("carid") String carid, Model model, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		HyundaiCarVO car = carService.readCar(carid);
		
		SaleVO sale = new SaleVO(car.getCarId(), car.getCarModel(), member.getMemberMobile(), member.getMemberName());
		saleService.addSale(sale);
		logger.info(sale.toString());
		logger.info(" /register URL POST method called. then createMember method executed.");
		return "redirect:/sale/list";
	}
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
	public String SaledlistGet(Model model) throws Exception{
		List<SaleVO> saledList = saleService.readSaleList();
		model.addAttribute("saledlist", saledList);
		return "sale/sale_list";
	}
	
}
