package com.transportapp.transportapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.transportapp.transportapp.model.Empresa;
import com.transportapp.transportapp.services.CompanyService;
import com.transportapp.transportapp.services.RepresentanteLegalService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

	@GetMapping("/getCompanyList")
	public List<Empresa> getCompanyList() {
		return companyService.findAll();
	}

	@GetMapping("/getTipoDocumentoList")
	public HashMap<String, String> getTipoDocumentoList() {
		return companyService.getTipoDocumentoList();
	}

	@PostMapping("/saveCompany")
	public void saveCompany(@RequestBody String jsonCompnay) {
		

		String json = "";
		JsonObject jsonObject = null;
		Map<String, Object> obj = new HashMap();
		
		try {
			json = (String) jsonCompnay.toString();
			jsonObject = new Gson().fromJson(json, JsonObject.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!jsonObject.get("id").isJsonNull()) {
			obj.put("id", jsonObject.get("id").getAsLong());

		}

		obj.put("nombre", jsonObject.get("nombre").getAsString().toString());
		obj.put("tipoDocumento", jsonObject.get("tipoDocumento").getAsString());
		obj.put("numeroDocumento", jsonObject.get("numeroDocumento").getAsInt());
		obj.put("direccion", jsonObject.get("direccion").getAsString());
		obj.put("ciudad", jsonObject.get("ciudad").getAsString());
		obj.put("departamento", jsonObject.get("departamento").getAsString());
		obj.put("pais", jsonObject.get("pais").getAsString());
		obj.put("telefono", jsonObject.get("telefono").getAsInt());
		obj.put("representanteLegalId", jsonObject.get("representanteLegalId").getAsLong());

		companyService.saveCompany(obj);

	}

}