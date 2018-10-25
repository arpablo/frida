/**
 * 
 */
package de.arpablo.frida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author arpablo
 *
 */
@Controller
@RequestMapping("/")
public class FridaController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
