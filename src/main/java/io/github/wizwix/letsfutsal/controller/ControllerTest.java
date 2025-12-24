package io.github.wizwix.letsfutsal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ControllerTest {

	@GetMapping("/test")
	@ResponseBody
	public String list(Model model) {
		return "aaaaaaaaaaaaaaaa";
	}
	
}
