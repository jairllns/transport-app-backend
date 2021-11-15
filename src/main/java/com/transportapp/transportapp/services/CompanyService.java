package com.transportapp.transportapp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transportapp.transportapp.model.Empresa;

@Service
public interface CompanyService {
	
	List < Empresa > findAll();
	
	void save(Empresa empresa);
	
	HashMap<String, String> getTipoDocumentoList();

	Optional<Empresa> findById(Long id);

	void saveCompany(Map<String, Object> obj);

}
