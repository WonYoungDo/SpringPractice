package com.tawny.practice.jstl.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@GetMapping("/list")
	public String storeList() {
		return "jstlStore/storeList";
	}
}
