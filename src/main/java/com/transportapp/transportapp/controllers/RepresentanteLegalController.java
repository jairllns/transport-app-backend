package com.transportapp.transportapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.transportapp.transportapp.model.Empresa;
import com.transportapp.transportapp.model.RepresentanteLegal;
import com.transportapp.transportapp.services.CompanyService;
import com.transportapp.transportapp.services.RepresentanteLegalService;

@RestController
@RequestMapping("/representanteLegal")
public class RepresentanteLegalController {

	@Autowired
	private RepresentanteLegalService representanteLegalService;


	@GetMapping("/getList")
	public List<RepresentanteLegal> getList() {
		return representanteLegalService.findAll();
	}
	

}