package kr.co.hyewon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1_get() {
		return "test1";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2_get() {
		return "test2_get";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String test2_post() {
		return "test2_post";
	}

	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3_get() {
		return "test3_get";
	}

	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	public String test3_post() {
		return "test3_post";
	}

	@GetMapping("/test4")
	public String test_get() {
		return "test4_get";
	}

	@PostMapping("/test4")
	public String test4_post() {
		return "test4_post";
	}

	@GetMapping("/test5")
	public String test5_get() {
		return "test5_get";
	}
	
	@PostMapping("/test5")
	public String test5_post() {
		return "test5_post";
	}
	
	@RequestMapping(value = "/test6", method = {RequestMethod.GET, RequestMethod.POST})
	public String test6() {
		return "test6";
	}

}

