package sk.Maha.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}
}
