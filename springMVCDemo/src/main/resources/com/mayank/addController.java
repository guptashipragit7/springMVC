package com.mayank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController {

	@RequestMapping("/add")
	public void add() {
		System.out.println("Test Meeeeee");
	}
}
