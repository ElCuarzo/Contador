package com.elcuarzo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class ControladorContador {
	
	@GetMapping("/")
	public String loginRegistro(HttpSession sesion,Model model) {
		Integer contador = (Integer) sesion.getAttribute("contador");
		if (contador == null) {
			contador = 0;
		}
		
		contador++;
		sesion.setAttribute("contador", contador);
		model.addAttribute("contador", contador);
		return "index.jsp";
	}
	
	@GetMapping("/contador")
	public String contador(HttpSession sesion ,Model model) {
		Integer contador = (Integer) sesion.getAttribute("contador");
		if (contador == null) {
			contador = 0;
		}
		return "contador.jsp";
	}
}
