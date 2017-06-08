package com.yg.festival.common.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutConroller {
	// 인사말 페이지
	@RequestMapping("/about/about")
	public String about() {
		return "/about/about";
	}

	// 페이지 가이드
	@RequestMapping("/about/pageguide")
	public String pageguide() {
		return "/about/pageguide";
	}

}
