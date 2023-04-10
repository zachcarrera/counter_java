package com.zachcarrera.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

	@GetMapping("/")
	public String index(HttpSession session) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count + 1);
		}
		return "index.jsp";
	}

	@GetMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	
	@GetMapping("/clear")
	public String clear(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter";
	}
	@GetMapping("/plus2")
	public String plus2(HttpSession session) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count + 2);
		}
		return "upBy2.jsp";
	}
}
