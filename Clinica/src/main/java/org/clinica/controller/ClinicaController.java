package org.clinica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clinica")
@RestController
public class ClinicaController {
	
	@GetMapping
	public String login() {
		return "Bienvenido";
	}

}
