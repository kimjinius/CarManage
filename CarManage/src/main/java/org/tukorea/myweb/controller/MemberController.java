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
import org.tukorea.myweb.domain.MemberVO;
import org.tukorea.myweb.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired(required = true)
	private MemberService memberService;

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String listMember(Model model) throws Exception {
		List<MemberVO> members = memberService.readMemberList();
		logger.info(" /member/list URL called. then listMemebr method executed.");
		model.addAttribute("members", members);
		return "member/member_list";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String createMemberGet() throws Exception {
		return "member/member_register";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String createMemberPost(@ModelAttribute("member") MemberVO vo) throws Exception {
		memberService.addMember(vo);
		logger.info(vo.toString());
		return "redirect:/member/list";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyMemberGet(@RequestParam("membermobile") String membermobile, Model model) throws Exception {
		MemberVO member = memberService.readMember(membermobile);
		model.addAttribute("member", member);
		return "member/member_modify";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyMemberPost(@ModelAttribute("member") MemberVO vo) throws Exception {
		memberService.updateMember(vo);
		logger.info(vo.toString());
		return "redirect:/member/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteMemberDelete(@RequestParam("membermobile") String membermobile, Model model) throws Exception {
		memberService.deleteMember(membermobile);
		return "redirect:/member/list";
	}

}
