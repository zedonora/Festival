package com.yg.festival.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnaConroller {
	// QnA
	@RequestMapping("/qna")
	public String qna() {
		return "/qna";
	}

}
