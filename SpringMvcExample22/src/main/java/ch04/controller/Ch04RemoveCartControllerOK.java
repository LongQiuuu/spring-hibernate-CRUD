package ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"ShoppingCart"})
@RequestMapping("/ch04")
public class Ch04RemoveCartControllerOK {
	
	@GetMapping("removeCartOK")
	public String removeCart(Model model, SessionStatus status) {
		status.setComplete();
		return "redirect:/ch04/showCartContent";
	}
}
